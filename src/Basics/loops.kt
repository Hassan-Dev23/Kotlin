package Basics//import com.sun.org.apache.xalan.internal.lib.ExsltMath.power

fun main(){


println("give a number wuth which i do coding for example find prime ")
    var number=readln().toInt()
    if(checkprime (number)){
        println ("number prime u")
    }
    else println("va ja va numbear prime koi ni ou ")

}
fun checkprime (number :Int):Boolean{
    if (number in 0..1) {

        return true
    }
    for (i in  2 until number){
        if (number%i==0){

            return false
        }
    }
    return true
}