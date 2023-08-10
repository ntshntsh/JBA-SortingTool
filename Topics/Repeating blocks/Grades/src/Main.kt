fun main() {

    val grades = (2..5).toList()
    val testResults = Array(readLine()!!.toInt()) { readLine()!!.toInt() }
    grades.map { grade -> testResults.count { grade == it } }
        .joinToString(" ")
        .let(::println)
}