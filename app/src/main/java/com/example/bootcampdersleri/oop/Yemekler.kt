package com.example.bootcampdersleri.oop

data class Yemekler(var id:Int, var ad:String, var fiyat:Int) {



    init{
        println("nesne oluştu")
    }

    fun bilgiAl(){
        println("id: ${id}")
        println("ad: ${ad}")
        println("fiyat: ${fiyat}")
        //this bulunduğu sınıfı temsil eder
        //super kalıtımda bir üst sınıfı temsil eder

    }

}