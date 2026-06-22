package main.kotlin.study

fun main() {
    helloworld()
    print(add(1,9))
}
fun helloworld() : Unit {
    println("hello world")
}

fun add(a : Int, b : Int) : Int {
    return a + b
}