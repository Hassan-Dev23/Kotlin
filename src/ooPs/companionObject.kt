package ooPs

fun main(){

    val hassan= client.setsalary(3)
    println(hassan)
//    after assigning companion no need to give reference of object
    val saira= client.setsalary(0)
    println(saira)
}

class client(val salary:Int){

    companion object salery{
        fun setsalary(langs:Int):client {
            if (langs >= 3) {
                return client(200)
            } else {
                return client(20)
            }
        }
    }

    override fun toString(): String {
        return "Client salary is $salary"
    }
}

