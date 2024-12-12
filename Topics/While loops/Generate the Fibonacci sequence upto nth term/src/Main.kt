import java.util.*

// main function
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // take input (the number of terms in the Fibonacci series)
    val n = scanner.nextInt()

    // initialize the first two integers of the Fibonacci series
    var t1 = 0
    var t2 = 1

    // Create a list to store the Fibonacci sequence
    val fibonacciSequence = mutableListOf(t1, t2)

    // Generate the Fibonacci sequence until we have n terms
    while (fibonacciSequence.size < n) {
        val nextTerm = t1 + t2
        fibonacciSequence.add(nextTerm)
        // Update the values of t1 and t2 for the next iteration
        t1 = t2
        t2 = nextTerm
    }

    // Print the Fibonacci sequence with commas and spaces between the terms
    println(fibonacciSequence.take(n).joinToString(", "))
}
