fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    val first = numbers.first()
    numbers[0] = numbers.last()
    numbers[numbers.lastIndex] = first
    println(numbers.joinToString(separator = " "))
}