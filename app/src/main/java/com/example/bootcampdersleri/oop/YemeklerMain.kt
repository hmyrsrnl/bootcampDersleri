package com.example.bootcampdersleri.oop

fun main(){

    val y1 = Yemekler(100, "kofte", 249)
    val y2 = Yemekler(200, "baklava", 300)
    y2.bilgiAl()
    val y3 = Yemekler(300,"patates", 799)

    println("id: ${y1.id}")
    println("ad: ${y1.ad}")
    println("fiyat: ${y1.fiyat}")
}