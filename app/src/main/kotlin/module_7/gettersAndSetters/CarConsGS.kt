package module_7.gettersAndSetters

import kotlin.random.Random

class CarConsGS(val brand: String,
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
		private set
//	get(){
//		println("current speed getter")
//		return field
//	}
//	set(value){
//		field = value
//		println("current speed setter")
//	}
	var fuelCount = 0.0
		private set
	init {
		println("Second init")
	}

	fun accelerate(speed: Double){
		val needFuel = speed * 0.1
		if (fuelCount > needFuel) {
			currentSpeed += speed
			useFuel(needFuel)
		}
		else
			println("Car has not enough fuel")
	}

	fun decelerate(speed: Double){
		currentSpeed = maxOf(0.0, currentSpeed - speed)
//		val finalSpeed = currentSpeed - speed
//		currentSpeed = if (finalSpeed < 0) 0.0
//		else finalSpeed
	}

	private fun useFuel(fuelCount: Double){
		this.fuelCount -= fuelCount
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

	companion object{
		const val wheelsCount = 4
		fun getCarClass(length: Double): String = when {
			length < 3.6 -> "A"
			length < 3.9 -> "B"
			length < 4.3 -> "C"
			length < 4.6 -> "D"
			length < 5 -> "E"
			else -> "F"
		}
	}
}