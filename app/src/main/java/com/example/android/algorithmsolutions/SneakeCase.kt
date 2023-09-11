package com.example.android.algorithmsolutions

import android.util.Log
import android.util.Log.println

/**
Snake Case
Have the function SnakeCase(str) take the str parameter being passed and return it in proper snake case format where each word is lowercased and separated from adjacent words via an underscore. The string will only contain letters and some combination of delimiter punctuation characters separating each word.

For example: if str is "BOB loves-coding" then your program should return the string bob_loves_coding.
Examples
Input: "cats AND*Dogs-are Awesome"
Output: cats_and_dogs_are_awesome
Input: "a b c d-e-f%g"
Output: a_b_c_d_e_f_g
 */

fun SnakeCase(str: String): String {

    var newStr =" "

    for(i in str){
        /*if(i.toString() == " " || i.toString() == "*" || i.toString() == "-")
            newStr += i
        println(i)*/

        println(i)
    }

    return newStr;

}

fun main() {
    SnakeCase("cats AND*Dogs-are Awesome")
}