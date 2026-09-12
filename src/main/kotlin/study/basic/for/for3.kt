package main.kotlin.study.basic.`for`

fun main(){
    for(i in 1..5){
        if(i == 3){
            break;
        }
        println(i)
    }

    println()

    for(i in 1..5){
        if(i == 4){
            continue;
        }
        println(i)
    }
}