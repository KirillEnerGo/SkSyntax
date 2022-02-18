package module_8

fun main() {
	val person = Person("Alex", 25)
	val driver = Driver("Ivan", 46, 25)

	person.name
	person.age
	person.eat()
	person.walk()
	person.sleep()

	driver.name
	driver.age
	driver.experience
	driver.eat()
	driver.walk()
	driver.sleep()
	driver.drive()
}