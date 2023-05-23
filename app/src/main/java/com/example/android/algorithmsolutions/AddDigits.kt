package com.example.android.algorithmsolutions

fun addDigits(num: Int): Int {
    var digitalRoot = 0
    var num = num
    num.toString().forEach {

    }
    while (num > 0) {
        digitalRoot += num % 10
        num = num / 10
        if (num === 0 && digitalRoot > 9) {
            num = digitalRoot
            digitalRoot = 0
        }
    }
    print(digitalRoot)
    return digitalRoot


}



fun sumDigit(num: Int): Int {
    val nums = num.toString() // “17”
    var sum = 0

    for (n in nums) { // “1”
        sum += n.toInt()
    }
    print(sum)

    return sum
}

fun main() {


    // sumDigit(38)
    //addDigits(100)

}