package module3

import java.util.*

fun main() {
	val esc = "Hi \nworld"
	println(esc)
	val common = """HI
		|Kotlin
		|This is a
		common string
	""".trimMargin()
	println(common)

	val seconChar = common[1]
	println(seconChar)

	println(esc.uppercase())
	println(common.contains("K"))
	println(common.replace("a", "3"))
	var replaceFirst = common.replaceFirst("common", "main")
	println(replaceFirst)
}