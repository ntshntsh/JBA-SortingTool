fun isVowel(a: Char): Boolean {
    val vowels = arrayOf('a', 'e', 'i', 'o', 'u')
    return vowels.contains(a.lowercaseChar())
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}