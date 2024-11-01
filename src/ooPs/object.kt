package ooPs

fun main(){
    println(hen.name)
    println(hen.age)
    val obj= object {
        val andable= true

    }
}
interface animal{
    val legs: Int
}

internal object hen:animal{

    val name= "murgi"
    val age= 1
    override val legs: Int=2

}