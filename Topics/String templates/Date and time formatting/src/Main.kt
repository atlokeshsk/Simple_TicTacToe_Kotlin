fun main() {
    val (hour,minutes,seconds) = readln().split(' ')
    val (day,month,year) = readln().split(' ')
    print("$hour:$minutes:$seconds $day/$month/$year")
}