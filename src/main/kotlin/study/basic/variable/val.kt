package main.kotlin.study.basic.variable

fun main(args: Array<String>) {
    val languages = arrayListOf("Java")
    println(languages)
    languages.add("Kotlin")
    println(languages)
}
// val 자체는 불변이라도 그 참조가 가리키는 객체의 내부 값은 변경될 수 있다