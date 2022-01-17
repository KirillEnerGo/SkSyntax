package module_6_3

fun main() {
	val list = listOf<Int>(1, 2, 3, 4, 5)
	// создает копию неизменяемого списка
	val mutableList = list.toMutableList()
	// Преобразование спика одного типа в список другого типа
	// функция map принимает в себя любда функции преобразования каждого элемента
	// из списка чисел в список строк
	val stringList = list.map {
		"This was a number $it"
	}
	stringList.forEach { println(it) }

	val mutableStringList = stringList.toMutableList()
	mutableStringList.add("new string")
	mutableStringList.forEach { println(it) }
}
