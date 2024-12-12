package tictactoe

import java.util.Scanner

fun printGrid(board: MutableList<MutableList<Char>>) {
    println("---------")
    for (row in board) {
        println("| ${row.joinToString(" ")} |")
    }
    println("---------")
}

fun checkWinner(board: MutableList<MutableList<Char>>, player: Char): Boolean {
    // Check rows and columns
    for (i in 0..2) {
        if (board[i].all { it == player }) return true // Row check
        if ((0..2).all { board[it][i] == player }) return true // Column check
    }
    // Check diagonals
    if ((0..2).all { board[it][it] == player }) return true // Main diagonal
    if ((0..2).all { board[it][2 - it] == player }) return true // Anti-diagonal

    return false
}

fun analyzeGameState(board: MutableList<MutableList<Char>>): Int {
    val flatBoard = board.flatten()
    val xCount = flatBoard.count { it == 'X' }
    val oCount = flatBoard.count { it == 'O' }

    // Check if counts are valid
    if (xCount - oCount >= 2 || oCount - xCount >= 2) {
        println("Impossible")
        return -1
    }

    val xWins = checkWinner(board, 'X')
    val oWins = checkWinner(board, 'O')

    // Check for impossible states (both X and O cannot win simultaneously)
    if (xWins && oWins) {
        println("Impossible")
        return -1
    }

    // Check for winners
    if (xWins) {
        println("X wins")
        return -1
    }
    if (oWins) {
        println("O wins")
        return -1
    }

    // Check for draw or game not finished
    if (flatBoard.contains(' ')) {
        return 1
    } else {
        println("Draw")
        return -1
    }
}

fun generateBoard(input: String): MutableList<MutableList<Char>> {
    return mutableListOf(
        input.substring(0, 3).toMutableList(),
        input.substring(3, 6).toMutableList(),
        input.substring(6, 9).toMutableList()
    )
}

fun isValidCoordinate(row: Int, col: Int): Boolean {
    return row in 0..2 && col in 0..2
}


fun main() {
    val scanner = Scanner(System.`in`)
    val input = " ".repeat(9)

    // Generate the board replacing '_' with ' ' for empty spaces
    val board = generateBoard(input)

    // Print the board before analysis
    printGrid(board)
    var currentPlayer = 'X'

    while (true) {
        val move = scanner.nextLine()

        try {
            // Parse input
            var (row, col) = move.split(" ").map { it.toInt() - 1 } // Convert to 0-indexed

            // Validate coordinates
            if (!isValidCoordinate(row, col)) {
                println("Coordinates should be from 1 to 3!")
                continue
            }


            // Check if cell is occupied
            if (board[row][col] != ' ') {
                println("This cell is occupied! Choose another one!")
                continue
            }

            // Make the move
            board[row][col] = currentPlayer
            currentPlayer = if(currentPlayer == 'X') 'O' else 'X'
            printGrid(board)
            when(analyzeGameState(board)){
                -1 -> break
                else -> continue
            }

        } catch (_: Exception) {
            // Handle non-numeric input or incorrect formatting
            println("You should enter numbers!")
        }
    }


}
