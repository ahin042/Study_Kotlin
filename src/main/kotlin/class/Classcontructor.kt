package main.kotlin.`class`

// contructor = 오버로딩 생성자를 만들 수 있음

fun main() {
    var a = _root_ide_package_.main.kotlin.`class`.me("홍길동")
}

class me(var name : String, val age : Int){
    constructor(name:String) : this(name, 26)
    init {
        println("my name is ${this.name}, ${this.age}")
    }
}