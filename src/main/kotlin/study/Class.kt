package main.kotlin.study

class Person(
    val name: String,
    val age : Int
)

fun main(args: Array<String>) {
    val person = Person("홍길동", 16)
    println(person.name)
    println(person.age)
}

