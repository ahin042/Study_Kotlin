package main.kotlin.study.function

fun main() {
    helloworld()
    println(add(1,9))
    println(kotlin())
}

fun helloworld() : Unit  { // Unit = 반환값 없음 (생략 가능)
    println("hello world")
}

fun add(a : Int, b : Int) : Int {
    return a + b
}

fun kotlin() : String {
    return "Hello Kotlin"
}