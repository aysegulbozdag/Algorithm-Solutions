package com.example.android.algorithmsolutions



fun main(){

val text = "hello"

    text.forEachIndexed{ index: Int, c: Char ->

        println("$c:$index")

    }

}