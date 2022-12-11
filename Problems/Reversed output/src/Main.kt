const val WORDS_COUNT = 2

fun main() {
    Array(WORDS_COUNT) { readLine()!! }.reversedArray().forEach { println(it) }
}