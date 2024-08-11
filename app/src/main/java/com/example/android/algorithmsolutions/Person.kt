package com.example.android.algorithmsolutions

data class Person(val email: String, val userName: String, val age:Int,)

fun main(){
    val person1 = Person("ayse@gmail.com","ayse", 26)
    val person2 = Person("ali@gmail.com","ali", 1)
    val person3 = Person("ferhat@gmail.com","ferhat", 28)

    var personList : MutableList<Person> = mutableListOf(person1,person2,person3)


    personSort(personList)

    println(personSort(personList))

}

fun personSort(list : List<Person>) : List<Person>{
    return list.sortedByDescending { it.age }
}
