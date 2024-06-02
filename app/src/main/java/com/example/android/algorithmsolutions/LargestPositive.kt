package com.example.android.algorithmsolutions

//https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/description/?envType=daily-question&envId=2024-05-02
fun findMaxK(nums: IntArray): Int {
    val numSet = nums.toSet()

    val positives = nums.filter { it > 0 }

    val sortedPositives = positives.sortedDescending()

    for (k in sortedPositives) {
        if (-k in numSet) {
            return k
        }
    }

    return -1
}

fun main() {
    findMaxK(intArrayOf(-1,10,6,7,-7,1)).let {
        println(it)
    }
}