package main.kotlin.ch02_operator

fun main() {
    for (i in 1..5 step 2) {
        for (j in 0..((5 - i)/2 - 1) step i) {
            print(" ")
        }
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}