package module_8

class KotlinDeveloper: Developer {
	// дополнительный конструктор
	// и обратимся к родительскому классу через super
	constructor(name: String, age: Int) : super(name, age)
	constructor(name: String, age: Int, experience: Int) : super(name, age, experience)

	override fun writeCode(){
		println("kt developer writing kt code")
		super.getCoffeBreak()
	}
	override fun getCoffeBreak() = true
}


fun test(){
	val developer = KotlinDeveloper("Alex", 25)
	// если явно не передавать experience оно установится = 5 как в базовом классе
}