package main.kotlin.ch02_operator

fun main() {
    // 산술 연산자
    val sum = 5 + 3
    val remainder = 5 % 3
    println(sum)
    println(remainder)

    // 비교 연산자
    val isEqual = (5 == 3)
    val isGreater = (5 > 3)
    println(isEqual)
    println(isGreater)

    // 논리 연산자
    val result = (5 > 3) && (2 < 4)
    println(result)
}