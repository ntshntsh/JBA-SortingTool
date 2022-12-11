fun main() {
    var counter = 1
    val input = readLine()!!.toInt()

    while (counter * counter <= input) {
        println(counter * counter)
        counter++
    }
}