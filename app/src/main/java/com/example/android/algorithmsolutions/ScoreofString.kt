package com.example.android.algorithmsolutions

import kotlin.math.abs

//https://leetcode.com/problems/score-of-a-string/description/?envType=daily-question&envId=2024-06-01

fun scoreOfString(s: String): Int {
    var value = 0
    for (i in s.indices) {
        var j = i + 1
        while (j < s.length) {
            val convevertChar = s[i].toInt()
            val convevertChar1 = s[j].toInt()
            value += abs(convevertChar - convevertChar1)
            j++
            break
        }

    }

    return value

}


fun main() {
    scoreOfString("zaz").let {
        println(it)
    }
}