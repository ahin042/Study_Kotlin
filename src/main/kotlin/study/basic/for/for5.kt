package main.kotlin.study.basic.`for`

fun CenterStar(num: Int): String {
    for (row in 1..num) {
        repeat(num - row) { print(" ") }
        repeat(2 * row - 1) { print("*") }
        println()
    }
    return ""
}

fun main() {
    val num = readLine()!!.toInt()
    CenterStar(num)
}