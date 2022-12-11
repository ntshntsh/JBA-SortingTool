fun main() {
    val n = readLine()!!.toInt()

    when {
        n / 1000 >= 1 -> println(4)
        n / 100 >= 1 -> println(3)
        n / 10 >= 1 -> println(2)
        n / 10 < 1 -> println(1)
    }
}