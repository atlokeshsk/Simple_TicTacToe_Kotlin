import kotlin.math.absoluteValue

// write your code here
fun getLastDigit(a: Int):Int {
    return (a%10).absoluteValue
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}