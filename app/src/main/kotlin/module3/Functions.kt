package module3

fun main() {
	val juniorGrossSalary = 100_000
	val middleGrossSalary = 200_000
	val seniorGrossSalary = 350_000
	calculateSavings(juniorGrossSalary, 0.3, 12)
	calculateSavings(juniorGrossSalary, 0.3, 24)
	calculateSavings(juniorGrossSalary, 0.4, 12)
	calculateSavings(juniorGrossSalary, 0.4, 24)
	calculateSavings(juniorGrossSalary, 0.5, 12)
	calculateSavings(juniorGrossSalary, 0.5, 24)
	calculateSavings(salary = juniorGrossSalary, rate = 0.5, time = 36)
	calculateSavings(middleGrossSalary)
	calculateSavings(seniorGrossSalary)

	val sum = calculateSavings(50000) + calculateSavings(100000)
	println("family of two = $sum")
}

fun calculateSavings(salary: Int, rate: Double = 0.5, time: Int = 12): Double
{
	val netSalary = salary * 0.87
	val bank = netSalary * rate * time
	println("Salary = $salary,  период = $time, процент от дохода = ${rate*100}% Результат = $bank ")
	return bank
}