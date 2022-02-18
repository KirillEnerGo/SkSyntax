package module_8

fun main() {
	val ktDev = KotlinDeveloper("Alex", 25)
	val javaDev = JavaDeveloper(name = "Ivan", age = 40, experience = 20)
	val cppDev = CppDeveloper(name = "Anna", age = 30, experience = 7)
	val developer = Developer(name = "MegaMozg", age = 70, experience = 50)
	val scalaDev = ScalaDeveloper(name = "ScalaDev", age = 30, experience = 5)

	ktDev.writeCode()
	println("ktDev level - ${ktDev.getLevel()}")
	// так как protected поставили модификатор
//	println("experience - ${ktDev.experience}")

	javaDev.writeCode()
	javaDev.sleep()
	println("javaDev level - ${javaDev.getLevel()}")
	// так как protected поставили модификатор
//	println("experience - ${javaDev.experience}")

	cppDev.writeCode()
	cppDev.walk()
	println("cppDev level - ${cppDev.getLevel()}")
	// так как protected поставили модификатор
//	println("experience - ${cppDev.experience}")

	developer.writeCode()
	println("developer level - ${developer.getLevel()}")
	// так как protected поставили модификатор
//	println("experience - ${developer.experience}")

	println("javaDev paradigm - ${javaDev.paradigm}")
	println("scalaDev paradigm - ${scalaDev.paradigm}")
}