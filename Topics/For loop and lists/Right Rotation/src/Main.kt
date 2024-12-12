fun rightRotate(arr: List<Int>, k: Int): List<Int> {
    val n = arr.size
    val effectiveK = k % n  // Handle rotations larger than the list size
    return arr.takeLast(effectiveK) + arr.take(n - effectiveK)
}

fun main() {
    // Read the number of elements in the list
    val N = readLine()!!.toInt()

    // Read the elements of the list
    val arr = mutableListOf<Int>()
    repeat(N) {
        arr.add(readLine()!!.toInt())
    }

    // Read the number of positions to rotate
    val k = readLine()!!.toInt()

    // Get the rotated list
    val rotated = rightRotate(arr, k)

    // Print the rotated list space-separated
    println(rotated.joinToString(" "))
}
