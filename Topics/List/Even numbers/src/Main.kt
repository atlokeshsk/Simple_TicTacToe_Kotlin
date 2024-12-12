fun solution(numbers: List<Int>) {
    // put your code here
    val result = mutableListOf<Int>()
    for (number in numbers){
        if(number%2 == 0){
            result.add(number)
        }
    }
    println(result.joinToString(" "))
}