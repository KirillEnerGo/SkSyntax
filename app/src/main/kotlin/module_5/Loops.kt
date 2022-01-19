package module3

fun main() {
    println("Enter the number: ")
    val num = readLine()?.toIntOrNull() ?: return
    println("num = $num")

    println("Сумма с помощью while = ${calculateSumByWhile(num)}")
    println("Сумма с помощью while и return= ${calculateSumByWhileInfiniteReturn(num)}")
    println("Сумма с помощью while и break = ${calculateSumByWhileInfiniteBreak(num)}")
    printEvenNumbers(num)
    println("Сумма с помощью do и while = ${calculateSumDoWhile(num)}")
    println("Сумма с помощью for и диапазонов = ${calculateSumFor(num)}")
    println("Печать кажого символа в строке ${printEachCharacter("stroka")}")
    printEvenNumberFor(num)
    printEvenNumberForDownTo(num)
}
fun calculateSumByWhile(n: Int): Long {
    var sum: Long = 0
    var currentNumber: Int = 0
    while (currentNumber <= n) {
        println("Iteration $currentNumber")
        sum += currentNumber
        currentNumber++
    }
    return sum
}

fun calculateSumByWhileInfiniteReturn(n: Int): Long {
    var sum: Long = 0
    var currentNumber: Int = 0
    while (true) {
        if(currentNumber > n) return sum
        sum += currentNumber
        currentNumber++
    }
}

fun calculateSumByWhileInfiniteBreak(n: Int): Long {
    var sum: Long = 0
    var currentNumber: Int = 0
    while (true) {
        if(currentNumber > n) break // выйдет из цикла
        sum += currentNumber
        currentNumber++
    }
    return sum
}

fun printEvenNumbers(n: Int) {
    var currentNumber = 0
    while (currentNumber <= n){
        val numberBefore = currentNumber
        currentNumber++
        if (numberBefore % 2 == 1) continue
        println(numberBefore)
    }
}

fun calculateSumDoWhile(n: Int): Long {
    var sum: Long = 0
    var currentNumber = 0
    do { // происходит сначала выполнение блока кода хотя бы 1 раз, потом проверка
        println("Iteration $currentNumber")
        sum += currentNumber
        currentNumber++
    } while (currentNumber <= n) //возвращает boolean значение
    return sum
}

fun calculateSumFor(n: Int): Long {
    var sum: Long = 0
    var range = 0 .. n
    var range2 = 0 .. n - 1 // чтобы n не включалось
    var range3 = 0 until n // чтобы n не включалось
    for (currentNumber in range) {
        sum += currentNumber
    }
    return sum
}

fun printEachCharacter(str: String) {
    for (ch in str) {
        println(ch)
    }
}

fun printEvenNumberFor(n: Int) {
    val range = 0 .. n step 2 // диапазон четных чисел
    for (currentNumber in range) {
        println(currentNumber)
    }
}

fun printEvenNumberForDownTo(n: Int) {
    val range = n downTo 0 step 2 // от n до 0 с шагом 2
    for (currentNumber in range) {
        println(currentNumber)
    }
}