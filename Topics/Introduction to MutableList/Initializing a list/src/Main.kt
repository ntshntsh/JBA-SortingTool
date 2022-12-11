fun main() {
    val numbers = MutableList(100) { 0 }
    val digits = mutableListOf<Int>(1, 10, 100)
    digits.forEach { value: Int -> numbers[value - 1] = value }
    // do not touch the lines below 
    println(numbers.joinToString())
}