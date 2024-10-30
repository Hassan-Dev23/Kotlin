package ooPs

fun main() {
val Chak23= chak23()
    println(Chak23.name)
//    println(Chak23.birthday) gives error -> Because it's private
//    println(Chak23.age)-> gives error because its protected it's only accesed in child Classes
}

open class PersonalDetails {
    constructor()

    val name = "Hassan"
    private val birthday = "10 OCT 2004"
    protected val age = 19
}

class chak23 : PersonalDetails() {
    fun test() {
        println(name)
//        println(birthday) -> gives error because its private
        println(age)
    }
}
