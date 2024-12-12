fun generatePassword(A: Int, B: Int, C: Int, N: Int): String {
    // Character pools
    val upperCase = ('A'..'Z').toList()
    val lowerCase = ('a'..'z').toList()
    val digits = ('0'..'9').toList()

    // Resulting password list
    val password = mutableListOf<Char>()

    // Add required characters
    repeat(A) { password.add(upperCase.random()) }
    repeat(B) { password.add(lowerCase.random()) }
    repeat(C) { password.add(digits.random()) }

    // Calculate remaining characters to meet the length N
    val totalAdded = A + B + C
    val remainingCharacters = N - totalAdded

    // Combine all character pools for random selection of remaining characters
    val allCharacters = upperCase + lowerCase + digits
    repeat(remainingCharacters) { password.add(allCharacters.random()) }

    // Shuffle the password to randomize the positions
    password.shuffle()

    // Ensure no two same characters are adjacent
    while (!isValidPassword(password)) {
        password.shuffle()
    }

    return password.joinToString("")
}

// Check if the password has no consecutive repeated characters
fun isValidPassword(password: List<Char>): Boolean {
    for (i in 1 until password.size) {
        if (password[i] == password[i - 1]) return false
    }
    return true
}

// Sample Input and Output
fun main() {
   val (A,B,C,N) = readln().split(" ").map { it.toInt() }
    println(generatePassword(A, B, C, N)) // Example output: PaSsw0rD
}
