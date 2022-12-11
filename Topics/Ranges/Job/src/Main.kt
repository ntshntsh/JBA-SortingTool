const val MIN_AGE = 18
const val MAX_AGE = 59

fun main() {

    if (readLine()!!.toInt() in MIN_AGE..MAX_AGE) println(true) else println(false)

}