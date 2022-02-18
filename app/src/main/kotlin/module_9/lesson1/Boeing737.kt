package module_9.lesson1

class Boeing737: Aircraft(10_000) {
	override val brand: String = "Boeing"
	override val model: String = "737"
	override val engineCount: Int = 2
	override val altitude: Int = 12500
	override val rows: Int = 40
	override val numberOfSeatsInARow: Int = 6

	override fun getSeatScheme() {
		println("   ABC   DEF")
		seatScheme.forEachIndexed { rowIndex, row ->
			print("${rowIndex + 1}  ")
			// пройдемся по всем элементам списка
			row.forEachIndexed { seatIndex, passenger ->
				//каждое место мы проверяем на наличие пассажира
				if (passenger == null)
					print('_')
				else
					print('X')
				//схематично добавим проход на схему
				if (seatIndex == row.lastIndex / 2)
					print("   ")
			}
			println()
			if (rowIndex != 0 && rowIndex % 10 == 0)
				println()
		}
	}

	override val capacity: Int = rows * numberOfSeatsInARow
}