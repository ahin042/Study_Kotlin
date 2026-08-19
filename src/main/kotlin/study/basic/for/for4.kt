package main.kotlin.study.basic.`for`

fun star(num : Int) : String {
    for(i in 1..num) {
        for(j in 1..i) {
            print("*")
        }
        println()
    }
    return ""
}

fun main() {
    val num = readLine()!!.toInt()
    star(num)
}