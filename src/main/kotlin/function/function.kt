package main.kotlin.function

fun main() {
    _root_ide_package_.main.kotlin.function.helloworld()
    println(_root_ide_package_.main.kotlin.function.add(1, 9))
    println(_root_ide_package_.main.kotlin.function.kotlin())
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