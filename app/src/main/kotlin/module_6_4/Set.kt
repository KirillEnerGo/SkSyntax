package module_6_4

import java.util.*
import kotlin.collections.HashSet
import kotlin.collections.LinkedHashSet

fun main() {
	val set = setOf(1, 2, 3, 1, 2)
	val hashSet = hashSetOf(1, 2, 3, 1, 2)
	val sortedSet = sortedSetOf(1, 2, 3, 1, 2).toSet()
	val linkedSet = linkedSetOf(1, 2, 3, 1, 2)

	val hashSet2 = HashSet<String>()
	val sortedSet2 = TreeSet<String>()
	val linkedSet2 = LinkedHashSet<String>()

	val firstSet = setOf(1, 2, 3, 4)
	val secondSet = setOf(3, 4, 5, 6)

	val unionSet = firstSet.union(secondSet) 		// обьединение
	val substract = firstSet.subtract(secondSet) 	// встречаются только в 1 множестве
	val intersect = firstSet.intersect(secondSet) 	// пересечение множеств

	println(unionSet)
	println(substract)
	println(intersect)
}