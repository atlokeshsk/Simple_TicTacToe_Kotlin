fun main() {
    val house = readLine()?.trim() ?: ""

    val result = when (house.lowercase()) {
        "gryffindor" -> "bravery"
        "hufflepuff" -> "loyalty"
        "slytherin" -> "cunning"
        "ravenclaw" -> "intellect"
        else -> "not a valid house"
    }

    println(result)
}
