fun main() {
    val input = readLine()!!

    for (i in input.indices) {
        if (input[i] in '0'..'9') {
            print(input[i])
            return
        }
    }
}