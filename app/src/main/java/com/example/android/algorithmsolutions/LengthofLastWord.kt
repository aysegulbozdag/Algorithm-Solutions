package com.example.android.algorithmsolutions


fun lengthOfLastWord(s: String): Int {
    val words = s.split(" ")

    var lastWord = words.last()

    for (i in words.size - 1 downTo 0) {
        if (words[i].isNotEmpty()) {
            lastWord = words[i]
            break
        }
    }

    return lastWord.length
}


fun main() {
    lengthOfLastWord(" fly me   to   the moon  ")
}