package main.kotlin.`class`

fun main() {
    var a = _root_ide_package_.main.kotlin.`class`.show("홍길동", 26)
    a.say()
}

class show(var name : String, var age : Int) {
    fun say() {
        println("my name is $name")
    }

    fun age() {
        println("my age is $age")
    }
}