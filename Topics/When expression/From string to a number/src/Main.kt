fun main() {
    val input = readLine()?.trim()?.lowercase() ?: ""

    val number = when (input) {
        "one" -> 1
        "two" -> 2
        "three" -> 3
        "four" -> 4
        "five" -> 5
        "six" -> 6
        "seven" -> 7
        "eight" -> 8
        "nine" -> 9
        else -> "Invalid input"
    }

    println(number)
}
