fun main() {
    val input = readln()
    val letter = input[0]

    // Loop through the alphabet from 'a' to the given letter (inclusive)
    for (ch in 'a'..letter-1) {
        print(ch)
    }
    println() // To move to the next line after printing the letters
}
