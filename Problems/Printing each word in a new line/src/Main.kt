import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    while (scanner.hasNext()) {
        scanner.nextLine().split(' ').forEach {
            println(it)
        }
    }
}