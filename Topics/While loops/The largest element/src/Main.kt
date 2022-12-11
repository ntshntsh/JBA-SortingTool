fun main() {
    var max = 0
    var n = readLine()!!.toInt()

    do {
        if (n > max) max = n
        n = readLine()!!.toInt()
    } while (n > 0)

    println(max)

}