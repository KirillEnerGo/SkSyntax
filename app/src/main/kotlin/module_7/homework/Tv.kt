package module_7.homework

class Tv(
	var mark: String,
	var model: String,
	var diagonal: Int
) {
	var tvTurn = 0
	var currentChanel = 0
	var listOfChannels = setOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
		private set
	var chanels: UByte = 0u
	var hashListOfChanels = hashMapOf<Int, String>()

	fun turnOnOff(i: Int) {
		when (i) {
			1 -> println("tv On")
			0 -> println("tv Off")
			else -> println("another key")
		}
	}

	fun changeVolume(volume: Int): Int {
		var default = 5
		var minVolume = 0
		var maxVolume = 10
		var resultVolume = default + volume
		if (resultVolume < 0)
			return minVolume
		else if (resultVolume > 10)
			return maxVolume
		return resultVolume
	}

	fun setChanel(chanel: Int){
		if (tvTurn == 0)
			tvTurn = 1
		currentChanel = chanel
	}
	
	fun volumeChanel(press: Int){
		if (press == 1)
			chanels++
		else if (press == 0)
			chanels--
	}

	companion object {
		const val maxVolume = 10
	}
}