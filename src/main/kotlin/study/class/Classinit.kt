package main.kotlin.study.`class`


fun main() {
    var a = hello("홍길동",26)
    a.say()
}

class hello(var name : String, var age : Int) {
    init {
        println("hello")
    }
    fun say() {
        println("my name is $name, $age")
    }
}