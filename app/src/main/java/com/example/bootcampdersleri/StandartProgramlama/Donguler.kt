package com.example.bootcampdersleri.StandartProgramlama

fun main() {
    for (i in 1..3) {
        println("dongu 1 : $i")
    }

    for (x in 10..20 step 5) {
        println("dongu 2 : $x")
    }

    for (y in 40 downTo 30 step 5) {
        println("dongu 3 : $y")
    }

    var sayac = 1
    while (sayac < 4) {
        println("dongu 4: $sayac")
        sayac++
    }

    for (i in 1..5) {
        if (i == 3) {
            break //döngü durur
        }
        println("dongu 5: $i")
    }

    for (i in 1..5) {
        if (i == 3) {
            continue //bulumdugu adımı pas geçer
        }
        println("dongu 6: $i")
    }


}