fun solution(strings: MutableList<String>, str: String): MutableList<String> {
    for (i in 0..strings.lastIndex) {
        if (strings[i] == str) strings[i] = "Banana"
    }
    return strings
}