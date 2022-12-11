fun main() {
    var i = 0
    var counter = 0
    val n = readLine()!!.toInt()

    while (counter < n) {
        i++
        if (counter + i <= n) {
            repeat(i) { print("$i ") }
            counter += i
        } else {
            repeat(n - counter) { print("$i ") }
            counter = n
        }
    }
}