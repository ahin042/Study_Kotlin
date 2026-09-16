package main.kotlin.ch02_operator

fun main() {
    for (i in 1..5) {
        for (j in 1..i) {
            print(" ")
        }
        for (j in 5 downTo i) {
            print("*")
        }
        println()
    }
}