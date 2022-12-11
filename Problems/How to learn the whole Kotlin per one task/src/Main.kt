const val WORDS_COUNT = 5

fun main() {
    Array(WORDS_COUNT) { readLine()!! }.forEach { print("$it ") }
}