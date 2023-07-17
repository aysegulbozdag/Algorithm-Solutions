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


fun main() {

    val a: Array<Int> = arrayOf(1, 2, 3, 5, 5, 5)
    containsDuplicate(a)


}