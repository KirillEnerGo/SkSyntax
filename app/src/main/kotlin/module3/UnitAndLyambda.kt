package module3

fun main() {
	// такой тип принимает Int и возвращает String
	val type: (Int) -> String
	/*
	* Например сигнатура функции:
	* fun calculateSavings(salary: Int, rate: Double = 0.5, time: Int = 12): Double
	*/
	val type2: (Int, Double, Int) -> Double

	/* func: ()->Unit
	* описывает функцию, которая не принимает аргументы и не возвращает значения
	*/

	val anonimous: (Int) -> Unit = fun(a: Int) { println(a)}
	println("анонимная функция ${anonimous(123)}")

	val str = "This is a typical task for developer interview"
	println(str.count{char -> checkSymbol(char)})
	println(str.count{checkSymbol(it)})
	println(str.count{it == 'e'})

	val vowels = "aiouyeo"
	println(str.filter { it !in vowels })

	val first = calculateSavingsLyambda(70000, 0.12, 12) {_, _, _, bank ->
		println("First member's bank: $bank")
	}
	val second = calculateSavingsLyambda(100000, 0.12, 12, printInfo = { salary, rate, time, bank ->
		println("First member's bank: $bank with salary = $salary,  период = $time, процент от дохода = ${rate * 100}%")
	})
	println(first + second)
}

fun multiply(func: () -> Unit) {}

fun checkSymbol(char: Char): Boolean = char == 'e'

fun calculateSavingsLyambda(
	salary: Int,
	rate: Double = 0.5,
	time: Int = 12,
	printInfo: ((salary: Int, rate: Double, time: Int, bank: Double) -> Unit)? = null
): Double {
	val netSalary = salary * 0.87
	val bank = netSalary * rate * time
	printInfo?.invoke(salary, rate, time, bank)
//	println("Salary = $salary,  период = $time, процент от дохода = ${rate * 100}% Результат = $bank ")
	return bank
}