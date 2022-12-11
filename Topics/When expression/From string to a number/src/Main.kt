fun main() {
    val input = readLine()!!
    val index = arrayOf(
        "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine"
    ).indexOfFirst { it.equals(input, true) }
    println(index + 1)
}