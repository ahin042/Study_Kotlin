package main.kotlin.study

// val 변수명 = arrayOf<자료형/생략>(값1, 값2, 값3)
fun main(args: Array<String>) {
    var array = IntArray(10, {0}) // 크기 : 10, 기본값 : 0
    println(array.contentToString()) // .contentToString() = 배열 내부의 값들을 출력
    for (i in 0..9) {
        array[i] = i + 1
    }
    println(array.contentToString())
}