package module_6_3

import kotlin.random.Random

fun main() {
	// создаем массив 10 элементов и заполняем рандомными значениями от -10 до 10
	val numbers = MutableList(10){ Random.nextInt(-10, 10)}
	println(numbers)
	numbers.removeAll { it < 0 }
	println(numbers)
}

fun iteratorHasNext()
{
	// создаем массив 10 элементов и заполняем рандомными значениями от -10 до 10
	val numbers = MutableList(10){ Random.nextInt(-10, 10)}
	println(numbers)
	val iterator = numbers.iterator()
	// hasNext проверяет что в коллекции еще есть элементы
	while (iterator.hasNext())
	{
		val item = iterator.next()
		if (item < 0)
			iterator.remove()
	}
	println(numbers)
}


fun dopolnitelnMassiv()
{
	// создаем массив 10 элементов и заполняем рандомными значениями от -10 до 10
	val numbers = MutableList(10){ Random.nextInt(-10, 10)}
	println(numbers)
	val candidatesToRemove = mutableListOf<Int>()
	numbers.forEach {
		if (it < 0)
			candidatesToRemove.add(it)
	}
	println(candidatesToRemove)
	// removeAll удаляет элементы из другой коллекции, если они совпадают
	numbers.removeAll(candidatesToRemove)
	println(numbers)
}