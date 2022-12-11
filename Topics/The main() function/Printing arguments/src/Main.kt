fun main(args: Array<String>) {
    if (args.count() == 3) {
        args.forEach {
            println("Argument ${args.indexOf(it) + 1}: $it. It has ${it.length} characters")
        }
    } else println("Invalid number of program arguments")
}