package module_9.lesson1

class Train(maxWeight: Int): Transporter(maxWeight) {
	override val capacity: Int = 0

	override fun move() {
		println("Train moving on rails")
	}
}