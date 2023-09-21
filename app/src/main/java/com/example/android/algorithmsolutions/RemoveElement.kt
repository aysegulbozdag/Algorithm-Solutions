package com.example.android.algorithmsolutions

fun removeElement(nums: IntArray, `val`: Int): Int {
    var a = 0
    for (i in nums.indices) {
        if (nums[i] != `val`) {
            nums[a] = nums[i]
            a++
        }

    }

    return a
}

fun main() {

    var nums = IntArray(4)

    nums[0] = 3
    nums[1] = 2
    nums[2] = 2
    nums[3] = 3

    removeElement(nums, 3)
}