package module_5

fun main() {
	var n :Int? = null
	n = enterNumber()
	println(n)
	var number = n.toInt()
	println(fibonachi(number))
}

fun fibonachi(number: Int):Int
{
	var f1 = 1
	var f2 = 2
	var n = number
	var sum = 0
//	for (num in 3..number)
//	{
//		sum = f1 + f2
//		f1 = f2
//		f2 = sum
//	}
	if (number == 0 || number == 1)
		return 1
	else
		return fibonachi(number - 1) + fibonachi(number - 2)
}

fun enterNumber():Int
{
	var n: Int? = null
	while (n == null || n <= 0)
		n = readLine()?.toIntOrNull()
	return n
}

