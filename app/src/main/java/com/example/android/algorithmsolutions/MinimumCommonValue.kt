package com.example.android.algorithmsolutions


fun getCommon(nums1: IntArray, nums2: IntArray): Int {

    for (i in nums1.indices){
        //1,2,3 -> 3 tane
        for (j in nums2.indices){
            //0 indexinden başlayacak
            if (i==j){
                println(nums1[i])

                println(nums2[j])
            }
        }
    }

    return 0
}

fun main(){
    var nums1 = IntArray(3)

    nums1[0] = 1
    nums1[1] = 2
    nums1[2] = 3

    var nums2 = IntArray(2)

    nums1[0] = 2
    nums1[1] = 4

    getCommon(nums1, nums2)
}