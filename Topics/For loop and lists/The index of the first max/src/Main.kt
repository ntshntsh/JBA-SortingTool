fun main() {
    val mutList = MutableList(readln().toInt()) { readln().toInt() }
    println(mutList.indexOf(mutList.maxOrNull()))
}