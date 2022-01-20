package module_6_4

fun main() {
	var n: Int? = null
	while (n == null || n <= 0)
		n  = readLine()?.toIntOrNull()
	val listOfNumbersAbonents = enterNumbersAbonents(n)
	println(listOfNumbersAbonents)
	val sortedListOfNumbersAbonents = listOfNumbersAbonents.filter { it.startsWith("+7") }
	println(sortedListOfNumbersAbonents)
	var setOfSortedListOfNumbersAbonents = sortedListOfNumbersAbonents
	var sizeOfSetNumbers = setOfSortedListOfNumbersAbonents.size
	println("size of set is $sizeOfSetNumbers")
	var unickSet = setOfSortedListOfNumbersAbonents.toSortedSet(compareBy<String>{it.length}.thenBy { it })
	println("unickSet is $unickSet")
//	for(num in setOfSortedListOfNumbersAbonents)
//	{
//		var sumOfSizeSet = 0
//		sumOfSizeSet += setOfSortedListOfNumbersAbonents.sumOf { it.length }
//		println(sumOfSizeSet)
//	}
	var sumOfSizeSet = setOfSortedListOfNumbersAbonents.sumOf { it.length }
	println("length of all nums is = $sumOfSizeSet")
//	var sortedMap = setOfSortedListOfNumbersAbonents

}

//fun mapOfNumbers(sortedSet: Set)

fun enterNumbersAbonents(n: Int): MutableList<String>
{
	var mutListAbon = MutableList<String>(n){""}
	for(num in mutListAbon.indices)
	{
		println("Enter number of abonent № $num")
		mutListAbon[num] = readLine().toString()
	}
	return mutListAbon
}