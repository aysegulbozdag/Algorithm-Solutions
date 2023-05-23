fun plusOne(digits: IntArray): IntArray {
    for (i in digits.size - 1 downTo 0) {
        if (digits[i] < 9) {
            digits[i]++
            return digits
        }
        digits[i] = 0
    }
    return intArrayOf(1, *digits)

}

fun main() {
    val a = IntArray(10)

    a[0] = 9
    a[1] = 8
    a[2] = 7
    a[3] = 6
    a[4] = 5
    a[5] = 9
    a[6] = 9
    a[7] = 9
    a[8] = 9
    a[9] = 9


    plusOne(a)
}