fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    println(a + b == 20 || b + c == 20 || a + c == 20)

    //fun main() = Scanner(System.`in`).run { println(Array(3) { nextInt() }.let { it.contains(it.sum() - 20) }) }
}