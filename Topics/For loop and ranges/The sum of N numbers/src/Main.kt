fun main() {
    // write your code here
    val n = readln().toInt()
    var sum = 0
    for (input in 1..n){
        val i = readln().toInt()
        sum += i
    }
    println(sum)
}