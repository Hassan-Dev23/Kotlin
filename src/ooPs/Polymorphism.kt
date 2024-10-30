open class One(){
    open fun function(){
        println("This is function IN class ONE")
    }
}
open class Two():One(){
    override fun function(){

        println("This is the function in class TWO")
    }
}
class Three():Two(){
   override fun function(){
       super.function()
        println(" This is the function in class THREE")
    }
}
fun main(){
    val poly=Three()
    poly.function()

}



