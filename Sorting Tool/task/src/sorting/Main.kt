package sorting

import java.util.Scanner

const val ARG_DATA = "-dataType"
const val MODE_LONG = "long"
const val MODE_LINE = "line"
const val MODE_WORD = "word"

const val SORT_MODE_COUNT = "byCount"

fun main(args: Array<String>) {

    val mode = if (ARG_DATA in args)
        args[args.indexOf(ARG_DATA) + 1]
    else MODE_WORD

    if (SORT_MODE_COUNT in args)
        read(mode).sortByCount(mode).printData(mode)
    else read(mode).sort(mode).printData(mode)
}

private fun String.getUnitName(): String {
    return when (this) {
        MODE_LONG -> "number"
        MODE_LINE -> "line"
        else -> "word"
    }
}

private fun Map<String, Int>.printData(mode: String) {
    val sum = this.values.sum()
    println("Total ${mode.getUnitName()}s: $sum")
    this.forEach {
        println("${it.key}: ${it.value} time(s), ${100 * it.value / sum}%")
    }
}

private fun List<String>.printData(mode: String) {

    val separator = when (mode) {
        MODE_LINE -> "\n"
        else -> " "
    }

    println("Total ${mode.getUnitName()}s: ${this.count()}")
    println("Sorted data: ${this.joinToString(separator)}")
}

private fun List<String>.sortByCount(mode: String): Map<String, Int> {
    val map = if (mode == MODE_LONG) {
        this.sortedBy { it.toInt() }.groupingBy { it }.eachCount()
    } else
        this.sorted().groupingBy { it }.eachCount()
    return map.toList().sortedBy { (_, v) -> v }.toMap()
}

//stage 3/6 sorting
private fun List<String>.sort(mode: String): List<String> {
    val list = this.toMutableList()
    if (mode == MODE_LONG)
        list.sortBy { it.toInt() }
    else
        list.sort()

    return list
}

private fun read(mode: String): MutableList<String> {
    val scanner = Scanner(System.`in`)
    val data = mutableListOf<String>()
    while (scanner.hasNext()) {
        val obj = when (mode) {
            MODE_LINE -> scanner.nextLine()
            else -> scanner.next()
        }
        data.add(obj.trim(' '))
    }
    return data
}