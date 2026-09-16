package main.kotlin.ch02_operator

fun main() {
    val range = 1..10          // 1부터 10까지
    val down = 10 downTo 1     // 10부터 1까지 역순
    val step = 1..10 step 2    // 1,3,5,7,9

    if (5 in range) {
        println("범위 안에 있음")
    }
    println("-----------")
    for (i in down) {
        println(i)
    }
    println("----------")
    for (i in 10 downTo 1) {
        println(i)
    }
    println("-----------")
    for (i in step) {
        println(i)
    }
    println("----------")
    for (i in 1..10 step 2) {
        println(i)
    }
}