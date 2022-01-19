package module_5

fun main() {
	whileFun(100)
	doWhileFun(100)
}

fun whileFun(curentSum: Int) {
	var count = 0
	var sum = curentSum
	println("Enter a start number")
	var n = readLine()?.toIntOrNull() ?: return
	while (sum < 100) {
		println("current number is: ")
		sum += n
		println("sum = $sum")
		n++
		count++
	}
	println("numbers count  While = $count")
}

fun doWhileFun(curentSum: Int) {
	var count = 0
	var sum = curentSum
	println("Enter a start number")
	var n = readLine()?.toIntOrNull() ?: return
	do {
		println("current number is: ")
		sum += n
		println("sum = $sum")
		n++
		count++

	} while (sum < 100)
	println("numbers count doWhile = $count")
}