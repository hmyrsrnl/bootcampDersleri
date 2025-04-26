package com.example.bootcampdersleri.StandartProgramlama

fun main(){

    val yas=19
    println(yas>=18)

    if(yas>=18){
        println("resit")
    }

    val ka = "admin"
    val s = 123456
    val sayi = 10

    if (ka == "admin" && s == 123456){
        println("hosgeldin")
    }else{
        println("hatali giris")
    }
    if(sayi == 9 || sayi == 10){
        println("sayi 9 veya 10")
    }else{
        println("sayo 9 veya 10 degil")
    }


    val number = 1
    when(number){
        1 -> println("sayi 1")
        2 -> println("sayi 2")
        else -> println("sayı tanımlı degil")
    }
}

