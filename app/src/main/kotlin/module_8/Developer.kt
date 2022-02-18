package module_8

import kotlin.random.Random

open class Developer(
	name: String,
	age: Int,
	protected val experience: Int = 5
): Person (name, age){
	open val paradigm = "OOP"
	open fun writeCode() = println("Programmer writing code")
	open fun getLevel() = when(experience){
		0 -> "intern"
		in 1..2 -> "junior"
		in 3..4 -> "middle"
		in 4..5 -> "senior"
		else -> "leading"
	}

	protected open fun getCoffeBreak() = Random.nextBoolean()
}