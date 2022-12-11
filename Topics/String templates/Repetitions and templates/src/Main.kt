fun main() {
    val text = readLine()!!

    println("${text.length} repetitions of the word $text: ${text.repeat(text.length)}")
}