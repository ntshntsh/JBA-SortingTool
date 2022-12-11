fun main() {
    var counter = 0

    repeat(readLine()!!.toInt()) {
        if (readLine()!!.toInt() > 0) counter++
    }

    println(counter)
}