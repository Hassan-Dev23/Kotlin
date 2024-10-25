class encap{
    public
    var age:Int?= null
    constructor()
    constructor(age:Int){
        this.age=age
    }
    fun sharia (){
        if (age!! > 18) {
            println("Sharia rules applid to you")

        }else println("Sharia rules will not applied to you\nbocause your age is less\nor in other words your are not Balig")
    }
    fun topics (){
        println("Encapsulation is nothing \nbut collection of data members and member functions inside a class is called encapsulation")
        println("Encapsulation: Wrapping code and data togather in a singel unit")
    }
}
fun main(){
    val enc=encap(19)
    enc.age=23
    println(enc.age)
    enc.topics()

    enc.sharia()
}