fun main() {
    var max = 0
    var n: Int

    repeat(readLine()!!.toInt()) {
        n = readLine()!!.toInt()
        if (n % 4 == 0 && n > max) max = n
    }

    println(max)
}