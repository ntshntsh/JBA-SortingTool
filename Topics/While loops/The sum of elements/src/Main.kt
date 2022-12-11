fun main() {
    var sum = 0
    var n: Int

    do {
        n = readLine()!!.toInt()
        sum += n
    } while (n > 0)

    println(sum)
}