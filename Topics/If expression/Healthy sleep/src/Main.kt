fun main() {
    val minSleep = readLine()!!.toInt()
    val maxSleep = readLine()!!.toInt()
    val currentSleep = readLine()!!.toInt()

    println(
        if (currentSleep < minSleep) {
            "Deficiency"
        } else if (currentSleep > maxSleep) {
            "Excess"
        } else "Normal"
    )

}