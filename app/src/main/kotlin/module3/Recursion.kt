package module3

fun main() {
    println("Enter the number: ")
    val num = readLine()?.toIntOrNull() ?: return
    println("num = $num")

    println(calculatedSumRecursive(num))
    println(calculatedSumRecursiveTailrec(num))
}

fun calculatedSumRecursive(n: Int): Int {
    return if(n == 0){
        0
    } else{
        return n + calculatedSumRecursive(n - 1)
    }
}

// рекурсивный вызов заменили обычным циклом, если рекурсивный переполняется
// хвостовая рекурсия tailrec
tailrec fun calculatedSumRecursiveTailrec(n: Int, accum: Int = 0): Int {
    return if(n == 0){
        accum
    } else{
        return calculatedSumRecursiveTailrec(n - 1, accum + n)
        // сделали последним в нашей функции, чтобы работал tailrec
    }
}