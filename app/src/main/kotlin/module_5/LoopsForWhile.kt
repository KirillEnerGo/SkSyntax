package module_5

fun main() {
	val n = readLine()?.toIntOrNull() ?: return

	var i = 0
	var sum = 0
	var sum2 = 2
	while (i <= n)
	{
		println("while loop $i")
		sum += i
		i++
	}

	for (j in 0..n){
		if (j % 2 != 0) continue
		println("for loop $j")
		sum2 += j
	}
	println("Sum of first $n = $sum")
	println("Sum2 of first $n = $sum2")
}