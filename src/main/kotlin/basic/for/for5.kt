package main.kotlin.basic.`for`

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
    _root_ide_package_.main.kotlin.basic.`for`.CenterStar(num)
}