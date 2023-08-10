package sorting

import java.util.Scanner
import java.io.File

const val ARG_DATA = "-dataType"
const val MODE_LONG = "long"
const val MODE_LINE = "line"
const val MODE_WORD = "word"

const val IO_DEFAULT = "console"

const val INPUT_FILE = "-inputFile"
const val OUTPUT_FILE = "-outputFile"

const val SORT_MODE_COUNT = "byCount"

fun main(args: Array<String>) {

    val splitMode = args.chooseMode(ARG_DATA, MODE_WORD)
    val inputMode = args.chooseMode(INPUT_FILE, IO_DEFAULT)
    val outputMode = args.chooseMode(OUTPUT_FILE, IO_DEFAULT)

    if (SORT_MODE_COUNT in args)
        read(splitMode, inputMode).sortByCount(splitMode).formData(splitMode).outData(outputMode)
    else read(splitMode, inputMode).sort(splitMode).formData(splitMode).outData(outputMode)
}

private fun Array<String>.chooseMode(arg: String, otherwise: String): String {
    return if (arg in this)
        this[this.indexOf(arg) + 1]
    else otherwise
}

private fun String.getUnitName(): String {
    return when (this) {
        MODE_LONG -> "number"
        MODE_LINE -> "line"
        else -> "word"
    }
}

private fun Map<String, Int>.formData(mode: String):String {
    val sum = this.values.sum()
    var res = "Total ${mode.getUnitName()}s: $sum\n"
    this.forEach {
        res+="${it.key}: ${it.value} time(s), ${100 * it.value / sum}%\n"
    }
    return res
}

private fun String.outData(filePath: String) {
    if (filePath == IO_DEFAULT)
        println(this)
    else File(filePath).writeText(this)
}

private fun List<String>.formData(mode: String):String {

    val separator = when (mode) {
        MODE_LINE -> "\n"
        else -> " "
    }

    return "Total ${mode.getUnitName()}s: ${this.count()}\n" +
            "Sorted data: ${this.joinToString(separator)}"
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

private fun readConsole(mode: String): MutableList<String> {
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

//stage 6/6 IO
private fun read(mode: String, filePath: String): MutableList<String> {
    val data = mutableListOf<String>()
    val file = File(filePath)

    if (file.exists()) {
        val lines = File(filePath).readLines()
        if (mode != MODE_LINE) {
            lines.forEach { it.split("""\\s*""".toRegex()).forEach { w -> data.add(w) } }
        } else {
            lines.forEach { data.add(it.trim(' ')) }
        }
    }
    else data.addAll(readConsole(mode))

    return data
}