import java.util.*

fun main() {
    val studentsMarks = mutableMapOf<String, Int>()
    var k = readLine()!!

    while (k!="stop") {
        studentsMarks.putIfAbsent(k, readLine()!!.toInt())
        k = readLine()!!
    }

    println(studentsMarks.toString())

}