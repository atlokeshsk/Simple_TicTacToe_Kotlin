import java.util.Scanner

fun main(args: Array<String>) {
    // Create a Scanner object for taking input
    val reader = Scanner(System.`in`)

    // Read an integer input
    val limit = reader.nextInt()
    val a = 10
    val a = 9

    // Check if limit is less than 0
    if (limit < 0) {
        println("Invalid Input")
    } else {
        var sum = 0
        repeat(limit){
            if((it+1)%2 == 0){
                sum += (it + 1) * (it + 1)
            }
        }
        println(sum)
    }
}