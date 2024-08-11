package com.example.android.algorithmsolutions

fun main() {

    var array: Array<Array<Int>> = arrayOf(arrayOf(1, 2), arrayOf(3, 4), arrayOf(5, 6))

    var newArray : Array<Int>  = emptyArray()
    for (i in array.indices){
        for (k in array[i]){
            newArray += k
        }
    }

    println(newArray.contentToString())

}