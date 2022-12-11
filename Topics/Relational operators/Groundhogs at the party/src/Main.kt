const val MIN_CUPS = 10
const val MAX_CUPS = 20
const val WEEKEND_ADDITION = 5

fun main() {
    val cups = readLine()!!.toInt()
    val isWeekend = readLine()!!.toBoolean()

    if (isWeekend) {
        println(cups >= MIN_CUPS + WEEKEND_ADDITION && cups <= MAX_CUPS + WEEKEND_ADDITION)
    } else {
        println(cups >= MIN_CUPS && cups <= MAX_CUPS)
    }
}