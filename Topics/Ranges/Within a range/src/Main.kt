fun main() {
    val firstLeft = readLine()!!.toInt()
    val firstRight = readLine()!!.toInt()
    val secondLeft = readLine()!!.toInt()
    val secondRight = readLine()!!.toInt()

    val n = readLine()!!.toInt()

    println (n in firstLeft..firstRight || n in secondLeft..secondRight)

}