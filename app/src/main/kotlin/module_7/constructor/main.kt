package module_7.constructor

fun main() {
//	val vw = CarConstructor(brand = "VW", model = "Passat", color = "Green")
//	val lada = CarConstructor(brand = "Lada", model = "Vesta", color = "Yellow")
//	val bmw = CarConstructor(brand = "BMW", model = "M5")
//
//	printInfo(vw)
//	printInfo(lada)
//	printInfo(bmw)

	val renault = CarConstructor(descriptor = "Renault" to "Logan", color = "Brown")
	printInfo(renault)

}

fun printInfo(car: CarConstructor)
{
	println("Brand - ${car.brand}, model - ${car.model}, color - ${car.color}")
}