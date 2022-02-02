package module_7_objects

object EiffelTower {
	var backlightsOn = false
	val height = 324

	fun turnbacklightsOn(){
		println("backlights on")
		backlightsOn = true
	}
	fun turnbacklightsOff(){
		println("backlights off")
		backlightsOn = false
	}
}