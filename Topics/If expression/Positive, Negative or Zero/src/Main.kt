fun main() {
    // write your code here
    val n = readln().toInt()
    println(
        when {
            n < 0 -> "negative"
            n > 0 -> "positive"
            else -> "zero"
        }
    )
}