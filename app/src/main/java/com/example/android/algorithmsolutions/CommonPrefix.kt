package com.example.android.algorithmsolutions


fun longestCommonPrefix(strs: Array<String>): String {
    var prefix = ""
    var a = 0
    while (a < 4) {
        for (i in strs.indices) {
            println(strs.get(i).get(a))
        }
        a++
    }


    return prefix
}

fun main() {
    val strs: Array<String> = arrayOf("flower", "flow", "flight")
    longestCommonPrefix(strs)
}