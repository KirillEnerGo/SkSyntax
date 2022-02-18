package module_9.lesson1

abstract class Aircraft(maxWeightArg: Int): Transporter(maxWeightArg) {
	abstract val brand: String
	abstract val model: String
	abstract val engineCount: Int
	abstract val altitude: Int

	// не имеют значений к моменту использования конструктора базового класса
	// как следствие это приведет к ошибкам или неправильному функционированию класса
	abstract val rows: Int
	abstract val numberOfSeatsInARow: Int
	// заведем двумерный список для схемы мест
	protected val seatScheme by lazy {
		List(rows) {
			MutableList<Passenger?>(numberOfSeatsInARow) {
				null
			}
		}
	}
		// rows(выше) при создании нового экземпляра класса в 1 очередь выполняется инициализация
		// базового класса и она происходит до запуска всей логики инициализации производных классов
		fun addPassenger(passenger: Passenger){
			val row = passenger.seat.row
			val number = passenger.seat.letter - 'A'
			seatScheme[row][number] = passenger
		}
		fun getPassenger(seat: Seat): Passenger? {
			val row = seat.row
			val number = seat.letter - 'A'
			return seatScheme[row][number]
		}
		abstract fun getSeatScheme()
		fun getInfo(){
			println(
				"""
				Aircraft: ${brand} ${model}
					|Max Weight: ${maxWeight}
					|Capacity: ${capacity}
					|Number of rows: ${rows}
					|Number of seats in a row: ${numberOfSeatsInARow}
			""".trimIndent())
		}

	override fun move() {
		println("Aircraft flying")
	}

	fun getAvailableSeat(): Seat?{
		val availableSeat = mutableListOf<Seat>()
		seatScheme.forEachIndexed { rowIndex, row ->  
			row.forEachIndexed { seatIndex, passenger ->
				if (passenger == null)
					availableSeat.add(Seat(rowIndex, 'A' + seatIndex))
			}
		}
		// чтобы вернуть случайное свободное место randomOrNull()
		return availableSeat.randomOrNull()
	}
}
