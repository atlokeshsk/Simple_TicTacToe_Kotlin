import kotlin.math.max

fun main() {
    // write your code here
    val n = readln().toInt()
    var maxSequence = 0
    var currMax = 0
    var previousMin = Int.MIN_VALUE
    for (i in 1..n){
        val x = readln().toInt()
        if(x >= previousMin){
            currMax++
        } else{
            if(currMax > maxSequence){
                maxSequence = currMax
                currMax=1
            }
        }
        previousMin = x
    }
    println(max(maxSequence,currMax))
}