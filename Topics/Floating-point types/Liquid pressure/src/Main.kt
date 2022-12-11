const val GRAVITY_CONSTANT = 9.8

fun main() {
    val density = readLine()!!.toDouble()
    val height = readLine()!!.toDouble()

    print(density * GRAVITY_CONSTANT * height)
}