fun main() {

    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    println(
        if (a > c) {
            if (a > b) a
            else b
        } else {
            if (c > b) c
            else b
        }
    )
}