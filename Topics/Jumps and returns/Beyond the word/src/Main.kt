fun main() {
    val input = readLine()!!
    for (s in 'a'..'z') {
        if (input.contains(s)) continue
        print(s)
    }
}