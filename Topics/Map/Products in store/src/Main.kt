fun bill(priceList: Map<String, Int>, shoppingList: MutableList<String>): Int {
    var sum = 0
    for (item in priceList.filterKeys { shoppingList.contains(it) }) {
        sum += item.value
    }
    return sum
}