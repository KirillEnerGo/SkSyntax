package module_6_4

fun main() {
	// Инициализация
	// Определения изначальных значений, необходимо предоставить в функцию пары
	// пары представляются через ключ to значение или через явное создание тип Pair
	val map = mapOf<Int, String>(1 to "one", Pair(2, "123"))
	val mutableMap = mutableMapOf<Int, String>() // не обладает свойствами hashMap и treeMap
	val hashMap = hashMapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")
	val treeMap = sortedMapOf(1 to "one")
	val linkedHashMap = linkedMapOf<Int, Int>()

	map[222]
	hashMap[222] = "1234"
	treeMap[222] = "1234"
	linkedHashMap[222] = 1234
}