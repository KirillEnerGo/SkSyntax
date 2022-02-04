package module_7.objects

import module_7.gettersAndSetters.CarConsGS

fun main() {
	// к обьекту обращаемся напрямую, не через экземпляр(как в классе)
//	println("Height - ${EiffelTower.height}")
//	EiffelTower.turnbacklightsOn()
//	EiffelTower.turnbacklightsOff()

	val tower1 = EiffelTower
	val tower2 = EiffelTower
	println("tower 1 backlights on ? - ${EiffelTower.backlightsOn}")
	println("tower 2 backlights on ? - ${EiffelTower.backlightsOn}")

	EiffelTower.turnbacklightsOn()

	println("tower 1 backlights on ? - ${EiffelTower.backlightsOn}")
	println("tower 2 backlights on ? - ${EiffelTower.backlightsOn}")

	println("Wheels count - ${CarConsGS.wheelsCount}")
	val classType = CarConsGS.getCarClass(3.8)
	println(classType)
}