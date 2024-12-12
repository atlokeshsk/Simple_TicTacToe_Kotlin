fun main() {    
    // write your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val h = readln().toInt()

    println(
        when{
            h in a..b -> "Normal"
            h < a -> "Deficiency"
            else -> "Excess"
        }
    )
}