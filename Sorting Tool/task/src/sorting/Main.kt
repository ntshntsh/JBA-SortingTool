package sorting

import java.util.Comparator
import java.util.Scanner

//const val ARG_DATATYPE = "-dataType"
const val MODE_LONG = "long"
const val MODE_LINE = "line"
//const val MODE_WORD = "word"

const val ARG_SORT = "-sortIntegers"
//const val ARG_SORT = "-sortingType"

fun main(args: Array<String>) {

    if (ARG_SORT in args){
        MODE_LONG.sortItOut()
    }
    else notJustNumbers(args[1])

}

private fun String.sortItOut() {
    val data = read(this).sort(this)
    printData(data)
}

private fun notJustNumbers(mode: String) {
    val data = read(mode).sort(mode)
    val max = data.last()
    val timesOfMax = data.count { it == max }
    printData(mode, data, max, timesOfMax)
}

private fun printData(
    data: List<String>
) {
    println("Total numbers: ${data.count()}")
    println("Sorted data: ${data.joinToString(" ")}")
}

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

private fun List<String>.sort(mode: String): List<String> {
    val list = this.toMutableList()
    if (mode == MODE_LONG) {
        list.sortBy { it.toInt() }
    } else {
        list.sortWith(Comparator
            .comparing<String?, Int?> { it.length }
            .thenComparing(Comparator.comparing { it })
        )
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