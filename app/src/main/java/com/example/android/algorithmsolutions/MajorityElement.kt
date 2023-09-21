package com.example.android.algorithmsolutions

fun majorityElement(nums: IntArray): Int {
    nums.sort()
    return nums[nums.size / 2]
}

fun main() {
    val nums:IntArray = IntArray(9)
    nums[0] = 1;
    nums[1] = 1;
    nums[2] = 3;
    nums[3] = 2;
    nums[4] = 2;
    nums[5] = 3;
    nums[6] = 3;
    nums[7] = 3;
    nums[8] = 0;
    majorityElement(nums)

}