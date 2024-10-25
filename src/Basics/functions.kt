package Basics

fun rotate(number:Int):Int {
    var n=number
    var c=0
    for (digit in number.toString()) {
        c++
    }
    val ch = n%10
    n/=10
    var ans=0;
    when (c){
        2 -> ans =n + (ch*10)
        3 -> ans =n + (ch*100)
        4 -> ans =n + (ch*1000)
        5 -> ans =n + (ch*10000)
        6 -> ans =n + (ch*100000)
        7 -> ans =n + (ch*1000000)
        8 -> ans =n + (ch*10000000)
        9 -> ans =n + (ch*100000000)

    }
    return ans
}


fun ma() {
    val n: Int = readln().toInt()
    println(rotate(n))

    println("hi typist you know but you dont know")





}
fun main(){
    val c= "hassan"

}






