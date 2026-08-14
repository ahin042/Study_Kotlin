package main.kotlin.study.basic.print

fun main() {
    var a = 3
    var b = 4
    print("hello")
    println("world")
    println("hello world")
    println("${a} + ${b} + ${a+b}")
    var long = """
        hello
        world
    """
    println(long)
}