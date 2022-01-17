package module_6_3

fun main() {
	val list = listOf<Int>(1, 2, 3, 4)
	val carList = listOf<String>("Mercedes", "BMW", "Ferrari")

	// Создаем пустой список
	val emptyList = listOf<String>()
	val secondEmptyList = emptyList<String>()

	// Массивы аналогично
	val massiv = arrayOf(1, 2, 3, 4)
	val emptyMassiv = arrayListOf<String>()
	val secondEmptyMassiv = emptyArray<Char>()

	// Конструкции для неизменяемых списков
	val secondList = List<Int>(5){0}
	val secondCarList = List<String>(3){index -> "Car №${index}"}

	// Изменяемые списки
	val mutableSecondList = MutableList<Int>(5){0}
	val mutableSecondCarList = MutableList<String>(3){index ->  "Car №${index}"}
//	sravnenie()
	obrashenie()
}

fun sravnenie(){
	val list = listOf<Int>(1, 2, 3, 4, 5)
	val mutableList = mutableListOf<Int>(1, 2, 3, 4, 5)

	println(mutableList.size)
//	list[1] = 4 // Изменять невозможно
	mutableList[1] = 4
	mutableList.add(6)
	mutableList.add(7)
	println(mutableList.size)
	println(mutableList.joinToString(", "))
}

fun obrashenie()
{
	val list = listOf<Int>(1, 2, 3, 4, 5)
	val carList = listOf<String>("Mercedes", "BMW", "Ferrari")
	println(list[list.lastIndex])
	// 0..list.size - 1 = element in list
	for (i in list.indices)
	{
		println(list[i] * i)
	}
	println("*******-------*******")
	list.forEach { item -> println(item) }
	println("*******-------*******")
	list.forEachIndexed { index, item ->
		println(item * index)
	}
	println("symma elements massiv * 5 = ${list.sumBy { it * 5 }}")
	println("count symbols in car string = ${carList.sumBy { it.length }}")
}
