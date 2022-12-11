fun solution(first: List<Int>, second: List<Int>): MutableList<Int> {
    val res = first.toMutableList()
    res.addAll(second)
    return res
}