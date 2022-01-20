package module_6_4

fun main() {
	val northBusSet = setOf(1, 4, 5, 6, 12, 13, 16, 19, 20)
	val southBusSet = setOf(1, 2, 3, 7, 4, 5, 6, 8, 16, 19, 20, 31)

	// автобусы только по северу
	val onlyNorthBus = northBusSet.subtract(southBusSet)
	println(onlyNorthBus)

	// автобусы которые ходят только по югу
	val onlySouthBus = southBusSet.subtract(northBusSet)
	println(onlySouthBus)

	// автобусы которые ходят между севером и югом, то есть пересекаются
	val globalBus = northBusSet.intersect(southBusSet)
	println(globalBus)

}