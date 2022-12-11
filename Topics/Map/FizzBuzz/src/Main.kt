fun iterator(map: Map<String, Int>) {
    for (element in map) {
        if (element.value % 3 == 0) {
            println("Fizz")
        } else {
            if (element.value % 5 == 0)
                println("Buzz")
            else println("FizzBuzz")
        }
    }

}