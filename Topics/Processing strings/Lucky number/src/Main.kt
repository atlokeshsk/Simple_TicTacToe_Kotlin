fun isLuckyNumber(N: String): String {
    val length = N.length

    // Ensure the number has an even number of digits
    if (length % 2 != 0) {
        throw IllegalArgumentException("Number must have an even number of digits")
    }

    // Split the number into two halves
    val firstHalf = N.substring(0, length / 2)
    val secondHalf = N.substring(length / 2)

    // Calculate the sum of digits in both halves
    val sumFirstHalf = firstHalf.sumOf { it - '0' }
    val sumSecondHalf = secondHalf.sumOf { it - '0' }

    // Return "YES" if sums match, otherwise "NO"
    return if (sumFirstHalf == sumSecondHalf) "YES" else "NO"
}

// Sample Input and Output
fun main() {
    val input1 = readln()


    println(isLuckyNumber(input1))

}
