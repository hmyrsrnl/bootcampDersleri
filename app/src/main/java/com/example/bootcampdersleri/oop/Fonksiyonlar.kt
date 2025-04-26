package com.example.bootcampdersleri.oop

class Fonksiyonlar {

    fun selamla(){
        val  sonuc = "merhaba"
        println(sonuc)
    }

    fun selamla2() : String {
        val  sonuc = "merhaba"
        return sonuc

    }

    fun selamla3(isim:String){
        val sonuc =" merhaba $isim"
        println(sonuc)
    }


    //overloading sınıf içindek aynı isimde fonksiyonları tekrar kullanmak
    fun topla(s1:Int,s2:Int){
        println("toplama : ${s1+s2}")

    }

    fun topla(s1:Double,s2:Int){
        println("toplama : ${s1+s2}")

    }

    fun topla(s1:Int,s2:Int,isim:String){
        println("toplama : ${s1+s2} işlem yapan: $isim")

    }



}