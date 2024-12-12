fun main() {
    val input = readLine()!!

    val result = when {
        input.isEmpty() -> input // If the string is empty, return it unchanged
        input.first() == 'i' -> {
            val number = input.drop(1).toInt() // Remove the first character and convert the rest to an integer
            (number + 1).toString() // Add 1 to the number and convert back to a string
        }
        input.first() == 's' -> {
            input.drop(1).reversed() // Remove the first character and reverse the remaining string
        }
        else -> input // If none of the above, return the string unchanged
    }

    println(result) // Output the result
}

