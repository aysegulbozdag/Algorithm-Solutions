package com.example.android.algorithmsolutions


fun containsDuplicate(nums: Array<Int>): Boolean {
    val hs = HashSet<Int>()

    for (i in nums) {
        hs.add(i)
    }

    if (nums.size != hs.size)
        return true

    return false
}

fun containsDuplicateBestPractice(nums: Array<Int>): Boolean {
    return (nums.size != nums.toSet().size)
}


fun main() {

    val nums: Array<Int> = arrayOf(1, 2, 3, 5, 5, 5)
    containsDuplicate(nums)
    containsDuplicateBestPractice(nums)


}