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
        printData(mode, read(mode).sortByCount(mode))
    else printData(mode, read(mode).sort(mode))
}

//stage  3/6 task
private fun String.sortItOut() {
    val data = read(this).sort(this)
    printData(this, data)
}

//stage 2/6 task
private fun notJustNumbers(mode: String) {
    val data = read(mode).sort(mode)
    val max = data.last()
    val timesOfMax = data.count { it == max }
    printData(mode, data, max, timesOfMax)
}

private fun String.getUnitName(): String {
    return when (this) {
        MODE_LONG -> "number"
        MODE_LINE -> "line"
        else -> "word"
    }
}

private fun printData(
    mode: String,
    data: Map<String, Int>
) {
    val sum = data.values.sum()
    println("Total ${mode.getUnitName()}s: $sum")
    data.forEach {
        println("${it.key}: ${it.value} time(s), ${100.0 * it.value / sum}%")
    }

}

private fun printData(
    mode: String,
    data: List<String>
) {

    val separator = when (mode) {
        MODE_LINE -> "\n"
        else -> " "
    }

    println("Total ${mode.getUnitName()}s: ${data.count()}")
    println("Sorted data: ${data.joinToString(separator)}")
}

//stage 2/6 output
private fun printData(
    mode: String,
    data: List<String>,
    max: String,
    timesOfMax: Int
) {
    val unitNameMsg = when (mode) {
        MODE_LONG -> "number"
        else -> "word"
    }
    val unitMaxMsg = when (mode) {
        MODE_LONG -> "greatest"
        else -> "longest"
    }
    val suffix = when (mode) {
        MODE_LINE -> "\n"
        else -> ""
    }
    println(
        """Total ${unitNameMsg}s: ${data.count()}.
        |The $unitMaxMsg $unitNameMsg: $suffix$max$suffix ($timesOfMax time(s), ${100 * timesOfMax / data.count()}%).
        """.trimMargin()
    )
}

private fun List<String>.sortByCount(mode: String): Map<String, Int> {
    val sortedData = mutableMapOf<String, Int>()

    return sortedData
}

//stage 3/6 sorting
private fun List<String>.sort(mode: String): List<String> {
    val list = this.toMutableList()
    if (mode == MODE_LONG) {
        list.sortBy { it.toInt() }
    } else {
        list.sort()
        //list.sortWith(Comparator
        //    .comparing<String?, Int?> { it.length }
        //    .thenComparing(Comparator.comparing { it })
        //)
    }
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