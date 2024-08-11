package com.example.android.algorithmsolutions

fun main() {

    val text = "deneme"

    findRepeatingChar(text)

    println(findRepeatingChar(text))

}

fun findRepeatingChar(text: String): String {

    for (i in text.indices) {


        for (j in 0 until i) {
            if (text[i] == text[j]) {
                
                return text[i].toString()
            }
        }
    }

    return "-1"
}