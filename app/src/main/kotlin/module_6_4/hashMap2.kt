package module_6_4

fun main() {
	val priceList = mutableMapOf<String, Int>(
		"Milk" to 80,
		"Yogurt" to 50,
		"Apples" to 150,
		"Bananas" to 70,
		"Coca-cola" to 100,
		"Orange juice" to 150
	)
	val priceListHash = hashMapOf<String, Int>(
		"Milk" to 80,
		"Yogurt" to 50,
		"Apples" to 150,
		"Bananas" to 70,
		"Coca-cola" to 100,
		"Orange juice" to 150
	)
	val priceListSorted = sortedMapOf<String, Int>(
		"Milk" to 80,
		"Yogurt" to 50,
		"Apples" to 150,
		"Bananas" to 70,
		"Coca-cola" to 100,
		"Orange juice" to 150
	)
	println(priceList)
	println(priceListHash)
	println(priceListSorted)
	priceList["Ice cream"] = 75 // добавление нового элемента
	priceList["Milk"] = 90 // значение по ключу Milk будет перезаписано
	priceList.remove("Yogurt") // удаление элемента

	// запросить все значения по соответствующему полю keys
	println(priceList.keys)

	// поиск наибольшего значения
	println(priceList.values.maxOrNull())

	// поиск товара (ключа) по значению наибольшей стоимости
	val maxValue = priceList.values.maxOrNull()
	println(priceList.filterValues { it == maxValue })
	println(priceList)

	// Map.entry
	println("-------*******-------")
	for(entry in priceList.entries)
		println("${entry.key} - ${entry.value}")
	println("-------*******-------")
	priceList.forEach {entry ->
		println("${entry.key} - ${entry.value}")
	}
	println("-------*******-------")
	// можно обьединить ключ значение и передать в лямбда ф-ию
	// и обращаться уже напрямую
	priceList.forEach {(key, value) ->
		println("$key - $value")
	}
	// мы можем преобразовать в sortedMap, не изменяя коллекцию
	// а создавая новую с уже отсортированными элементами
	val sortedMap = priceList.toSortedMap()
	println(sortedMap)
	// чтобы отсортировать в определенном порядке
	// все элементы сортируются по ключам
	// если одинаковые значения, остается только последнее совпадение, поэтому используем -> thenBy
	val sortedMapCompareByKey = priceList.toSortedMap(compareBy<String>{ it.length }.thenBy{ it })
	// как отсортировать по значению
	//	val sortedMapCompareByValue = priceList.toSortedMap(compareBy<Int>{it.value})


}