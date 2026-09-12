package main.kotlin.`class`


fun main() {
    var a = _root_ide_package_.main.kotlin.`class`.hello("홍길동", 26)
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