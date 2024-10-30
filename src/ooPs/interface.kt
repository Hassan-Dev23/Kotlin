interface areafun{
    fun area(): Double
    fun greet()= println("aish kr")
}
open class shape:areafun{
     override fun area(): Double = 0.0

}
class circle(val radius:Double):shape(){
    override fun area():Double = Math.PI*radius*radius
}
class square(val side:Double):shape(){
    override fun area(): Double = side * side
}
class rectangle(val len:Double,val wid:Double):shape(){
    override fun area(): Double= len * wid
}
class human (height:Double):areafun{
    override fun area(): Double = 1.7
}
fun loop(arr :Array<areafun>){
    for ( index in arr){
        println(index.area())
        println(index.greet())
    }
}
fun main(){
    val areaArray:Array<areafun> = arrayOf(circle(4.0),square(6.0),rectangle(5.0,5.0),human(20.4))
    loop(areaArray)
}
