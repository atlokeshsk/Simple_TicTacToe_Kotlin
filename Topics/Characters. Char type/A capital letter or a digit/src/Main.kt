fun main() {
    // write your code here
    val ch = readln().first()
    when{
        ch.isUpperCase() -> println(true)
        ch.isDigit() && ch != '0' -> println(true)
        else -> println(false)
    }
}