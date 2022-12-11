fun main() {
    /*fun main() {
    val grades = arrayOf(2, 3, 4, 5)
    val testResults = Array(readLine()!!.toInt()) { readLine()!!.toInt() }
    val result = mutableListOf<Int>()

    grades.forEach {
        val value = it
        result.add(testResults.count { value == it })
    }

    println(result.joinToString(" "))
    }*/

    /*fun main() {

    val n = readLine()!!.toInt()
    val testResults = Array(n) { readLine()!!.toInt() }
    var grade = 2

    repeat(4) {
        print(testResults.count { it == grade }.toString() + " ")
        grade++
    }
    }*/

    val grades = (2..5).toList()
    val testResults = Array(readLine()!!.toInt()) { readLine()!!.toInt() }
    grades.map { grade -> testResults.count { grade == it } }
        .joinToString(" ")
        .let(::println)
}