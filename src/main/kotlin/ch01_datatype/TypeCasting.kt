package main.kotlin.ch01_datatype

fun main() {
    // 숫자 타입 간 변환은 명시적 변환 함수 사용 (자동 변환 없음)
    val num: Int = 10
    val d: Double = num.toDouble()   // 10.0
    val d2: Double = 3.14
    val num2: Int = d2.toInt()        // 3, 소수점 버려짐
    // 임의 타입 변환 (as, as?)
    val any: Any = "문자열"
    val str = any as String          // 실패 시 예외 발생
    val str2 = any as? String        // 실패 시 null 반환 (안전한 캐스팅)
}