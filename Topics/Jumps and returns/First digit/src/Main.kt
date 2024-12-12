fun main() {
    val input = readLine() ?: ""

    // Find the first digit in the string
    val firstDigit = input.firstOrNull { it.isDigit() }

    // Print the first digit
    println(firstDigit)
}
