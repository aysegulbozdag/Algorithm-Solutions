package com.example.android.algorithmsolutions

fun longestCommonPrefix(strs: Array<String>): String {

    val newStrs = strs.minByOrNull { it.length } ?: ""
    for (i in newStrs.indices) {
        var prefix = newStrs[i]
        for (str in strs) {
            if (str[i] != prefix) {

                return newStrs.substring(0, i)
            }
        }

    }

    return ""
}

fun main() {
    val strs: Array<String> = arrayOf("flower", "flow", "flight")
    longestCommonPrefix(strs)
}