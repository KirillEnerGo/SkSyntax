package module_9.lesson1

import kotlin.random.Random

fun main() {
	//val transporter = Transporter(100) //ошибка
	val train = Train(1000_000)
	train.move()
	println(train.capacity)

	val boeing737 = createAndFillBoeing()
	println(boeing737.getInfo())
	boeing737.getSeatScheme()

	println("================================")

	val zeppelin = createAndFillZeppelin()
	println(zeppelin.getInfo())
	zeppelin.getSeatScheme()
}

fun createAndFillBoeing(): Boeing737{
	val boeing737 = Boeing737()
	val passengerCount = Random.nextInt(1, boeing737.capacity)
	for (i in 0 until passengerCount) {
		//выходим из этого цикла если самолет заполнен полностью null
		val seat = boeing737.getAvailableSeat() ?: return boeing737
		val passenger = Passenger(
			name = "Ivan",
			lastName = "Petrov",
			passport = "${Random.nextInt(1000, 7777)} ${Random.nextInt(100000, 777777)}",
			seat = seat
		)
		boeing737.addPassenger(passenger)
	}
	return boeing737
}

fun createAndFillZeppelin(): Zeppelin {
	val zeppelin = Zeppelin()
	val zeppelinPassengers = Random.nextInt(1, zeppelin.capacity)
	for (i in 0 until zeppelinPassengers) {
		//выходим из этого цикла если самолет заполнен полностью null
		val seat = zeppelin.getAvailableSeat() ?: return zeppelin
		val passenger = Passenger(
			name = "Ivan",
			lastName = "Petrov",
			passport = "${Random.nextInt(1000, 7777)} ${Random.nextInt(100000, 777777)}",
			seat = seat
		)
		zeppelin.addPassenger(passenger)
		}
	return zeppelin
}

