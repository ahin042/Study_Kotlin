package main.kotlin.study.array

fun main() {
    print("문자 수 입력 : ")
    val number = readLine()!!.toInt()
    val list = Array(number) { "" }
    for (i in 0..(number - 1)) {
        print("${i + 1}번째 문자를 입력해주세요 : ")
        var input: String = readLine()!!
        list[i] = input
    }
    println(list.contentToString())
}