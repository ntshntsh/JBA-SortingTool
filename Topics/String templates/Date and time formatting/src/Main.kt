import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val time = scanner.nextLine().replace(' ', ':', false)
    val date = scanner.nextLine().replace(' ', '/', false)

    println("$time $date")
}