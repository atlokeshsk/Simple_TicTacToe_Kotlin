// write your function here
fun isVowel(letter: Char): Boolean {
    val vowels = listOf('a','e','i','o','u')
    return vowels.contains(letter.lowercaseChar())
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}