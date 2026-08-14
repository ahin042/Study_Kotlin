package main.kotlin.study.basic.`for`

fun main() {
    for (i in 0..10 step 2) {
        println(i)
    }
    println("-----")
    for (i in 10 downTo 0 step 2) {
        println(i)
    }
}