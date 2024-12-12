fun main() {
    // write your code here
    val (year,day,month) = readln().split("-")
    println(listOf<String>(day,month,year).joinToString("/"))
}