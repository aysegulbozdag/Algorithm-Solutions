package com.example.android.algorithmsolutions


fun searchInsert(nums: IntArray, target: Int): Int {

    var a = nums
    for(i in nums.indices){
        if (nums[i] == target){
            println("hadi bakalımmm : $i")
            return i
        }else if (nums.contains(target).not()) {
      //     nums[nums.lastIndex +1] = target
          //  nums.plus(target)

            a += 7

            a.sort()

        //    println(a)
           searchInsert(a,target)
            break

        }
    }

    return 0
}


fun main(){
    var nums = IntArray(4)

    nums[0] = 1
    nums[1] = 3
    nums[2] = 5
    nums[3] = 6


    searchInsert(nums, 7)
}