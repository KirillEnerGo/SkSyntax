package module_7_objects

import module_7_gettersSetters.CarConsGS

fun main() {
	// к обьекту обращаемся напрямую, не через экземпляр(как в классе)
//	println("Height - ${EiffelTower.height}")
//	EiffelTower.turnbacklightsOn()
//	EiffelTower.turnbacklightsOff()

	val tower1 = EiffelTower
	val tower2 = EiffelTower
	println("tower 1 backlights on ? - ${tower1.backlightsOn}")
	println("tower 2 backlights on ? - ${tower2.backlightsOn}")

	tower1.turnbacklightsOn()

	println("tower 1 backlights on ? - ${tower1.backlightsOn}")
	println("tower 2 backlights on ? - ${tower2.backlightsOn}")

	println("Wheels count - ${CarConsGS.wheelsCount}")
	val classType = CarConsGS.getCarClass(3.8)
	println(classType)
}