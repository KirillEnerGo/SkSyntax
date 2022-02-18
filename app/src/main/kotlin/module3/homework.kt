package module3

fun main() {
	var str = "F2p)v\"y233{0->c}ttelciFc"

	println("${part1(str)} ${part2(str)}")
}
fun part1(str: String): String{
//	println(str.length)

	var str1 = str.substring(0, str.length/2 - 1)
//	println(str1)

	// 2.1. В исходном тексте заменить все символы о на символ 0 (ноль).
	var str21 = str1.replace('0', 'o')
//	println("2.1 = $str21")

	// 2.2. В получившемся тексте заменить каждый символ сообщения символом,
	// стоящим на 3 правее от исходного (сдвиг каждого символа вправо на 3).
	var str22 = str21.map { char -> char - 3 }.joinToString("")
//	println("2.2. = $str22")

	// 2.3. В получившемся тексте заменить все символы u на цифру 4.
	var str23 = str22.replace('4', 'u')
//	println("2.3. = $str23")

	// 2.4. В получившемся тексте заменить все символы s на цифру 5.
	var str24 = str23.replace('5', 's')
//	println("2.4. = $str24")

	var shiftedString = str24.map { char -> char + 1 }.joinToString("")
//	println(shiftedString)

	return shiftedString
}

fun part2(str: String): String{
	var str2 = str.substring(str.length / 2, str.length)
//	println(str2)

	// 3.1. Заменить пробелы на символ _
	var str31 = str2.replace('-', ' ')
//	println(str31)

	// 3.2. В получившемся тексте заменить каждый символ сообщения символом,
	// стоящим на 4 правее от исходного (сдвиг каждого символа вправо на 4).
	var str32 = str31.map{char -> char -4}.joinToString("")
//	println(str32)

	// 3.3. Развернуть получившуюся строку.
	var str33 = str32.reversed()
//	println(str33)
	return str33
}

