abstract class A(){
    abstract fun gg()
    fun f(){
        println("AAho Hello World")
    }

}
class b:A(){
     override fun gg() {
        println("ha")
    }
}
fun main(){
    val obj=b()
    obj.f()
}