package main.kotlin.study.function

fun main() {
    print("이름 : ")
    var a = readLine()!!
    print("나이 :")
    var b : String = readLine()!!
    print(info(a,b))
}

fun info(a : String,b : String) : String {
    return "이름은 $a 이며 나이는 $b 살 입니다"
}
