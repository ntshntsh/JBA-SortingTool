fun main() {
    val firstLeft = readLine()!!.toInt()
    val firstRight = readLine()!!.toInt()
    val secondLeft = readLine()!!.toInt()
    val secondRight = readLine()!!.toInt()

    val n = readLine()!!.toInt()

    if (n in firstLeft..firstRight && n in secondLeft..secondRight)
        println(true)
    else println(false)
}