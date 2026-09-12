package main.kotlin.study.array

fun main() {
    val arr1 = Array(5,{0})   // 0 0 0 0 0
    val arr2 = Array(5, {"1"})    // 1 1 1 1 1
    val arr3 = Array(5, {'2'})    // 2 2 2 2 2
    val arr4 = Array(5, {it})     // 0 1 2 3 4
    val arr5 = Array(5){it*2}     // 9 2 4 6 8

    println(arr1.contentToString())
    println(arr2.contentToString())
    println(arr3.contentToString())
    println(arr4.contentToString())
    println(arr5.contentToString())
}