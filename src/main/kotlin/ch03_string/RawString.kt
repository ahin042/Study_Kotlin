package main.kotlin.ch03_string

fun main() {
    val say:String = """
        name : 똥개
        age : 16
    """.trimIndent()
    println(say)
}