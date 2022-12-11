fun main() {
    val grades = arrayOf(0, 1, -1)
    val testResults = Array(readLine()!!.toInt()) { readLine()!!.toInt() }
    grades.map { grade -> testResults.count { grade == it } }
        .joinToString(" ")
        .let(::println)
}