package main.kotlin.function

fun main() {
    print("이름 : ")
    var a = readLine()!!
    print("나이 :")
    var b : String = readLine()!!
    print(_root_ide_package_.main.kotlin.function.info(a, b))
}

fun info(a : String,b : String) : String {
    return "이름은 $a 이며 나이는 $b 살 입니다"
}
