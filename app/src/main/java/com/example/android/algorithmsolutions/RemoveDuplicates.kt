package com.example.android.algorithmsolutions


fun removeDuplicates(nums: IntArray): Int {

    var newNums: Array<Int> = emptyArray()

    for (i in nums.indices) {
        if (newNums.isEmpty() || newNums.contains(nums[i]).not()) {
            newNums += nums[i]
        }
    }

    println(newNums.contentToString())

    return newNums.size
}

fun main() {

    val nums = intArrayOf(0, 0, 1, 2, 3)

    removeDuplicates(nums)
}