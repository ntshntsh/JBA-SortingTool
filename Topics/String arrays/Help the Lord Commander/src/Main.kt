fun main() {
    val beyondTheWall = readLine()!!.split(',').map { it }.toTypedArray()
    val backFromTheWall = readLine()!!.split(',').map { it }.toTypedArray()

    print(beyondTheWall.contentEquals(backFromTheWall))


}