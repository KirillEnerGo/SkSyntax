package module3

fun main() {
    val string: String = "string!"
    val nullableString: String? = "str4ing!"
    val nullableString2: String? = null
    val length: Int = string.length
    val nullableLength: Int? = nullableString?.length

    println(string.length)
    println(nullableString?.length)
    println(nullableLength)
    println(nullableString2?.uppercase())

    // перевернуть и найти в строке символ
    nullableString?.reversed()
        ?.find {it == '4'}
        ?.isDigit()

    // после проверки на null, мы можем обращаться к строке как не nullable
    if (nullableString != null){
        println("String length is ${nullableString.length}")
    } else {
        println("string is null")
    }

}