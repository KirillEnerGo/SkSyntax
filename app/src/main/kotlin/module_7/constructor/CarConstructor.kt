package module_7.constructor

import kotlin.random.Random


class CarConstructor(val brand: String,
					 val model: String,
					 val color: String = "white") {

	// дополнительный конструктор вызывает основной с помощью this
	constructor(descriptor: Pair<String, String>, color: String): this(
		brand = descriptor.first,
		model = descriptor.second,
		color = color
	) {
		println("secondary constructor init")
	}

	init {
		println("Car init")
	}
	var currentSpeed = 0.0
	init {
		println("Second init")
	}
	fun move()
	{
		val distance = Random.nextInt(1, 10)
		println("Car passed $distance km")
	}

	fun start(){
		println("Car  started")
	}

	fun stop(){
		println("Car stoped")
	}
}