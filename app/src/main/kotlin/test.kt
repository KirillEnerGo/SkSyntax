fun main() {
	val priceList = mutableMapOf<String, Int>(
		"Milk" to 80,
		"Yogurt" to 50,
		"Apples" to 150,
		"Bananas" to 70,
		"Coca-cola" to 100,
		"Orange juice" to 150
	)
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
}