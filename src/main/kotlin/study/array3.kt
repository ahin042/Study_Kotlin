package main.kotlin.study

fun main(args: Array<String>) {
    val fruits = arrayOf("Apple", "Banana", "Orange")
    for (i in fruits) {
        println("I ate ${i}")
    }
    println("-----")
    val snack = arrayOf("cake","candy","pineapple") // 자료형 생략 가능
    for (i in snack) {
        println("I ate ${i}")
    }
}