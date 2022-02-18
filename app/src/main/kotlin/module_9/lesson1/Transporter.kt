package module_9.lesson1

abstract class Transporter(
	val maxWeight: Int
) {
	abstract val capacity: Int
	abstract fun move()
}