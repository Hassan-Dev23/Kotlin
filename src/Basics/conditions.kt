package Basics

fun main() {
//    println ("enter number to do operation")
//    var n1:Int = readln().toInt()
//    var n2=readln().toInt()
//    if(n2==n1)
//        println("yeah the numbers you entered are equal")
//    else if(n2>n1)
//        println("$n2 number that you entered 2nd time is grater then first ")
//
//    else
//        println("number is actually first yessss....")
////using if as a expression
//    println ("enter  number to do what i do ")
//    var na=readln()
//    var nb=readln()
//    var ab = if (na <nb)
//        nb
//    else
//        na
//
//println("this $ab is maximum hana mana gana")

//    var grade =if (marks>100)
//        "SA super man no need study anymore "
//    else if(marks in 91 ..100)
//        'A'
//    else if(marks in 81 ..90)
//        'B'
//    else if (marks in 60 .. 80)
//        'F'
//    else
//        "Wah baty wah moj kr di wah baty wah "
    println("enter marks to find grade which goes to your dady")
    val marks = readln().toInt()
    var grade = when (marks) {
        in 100..Int.MAX_VALUE -> "sa suprerb"
        else -> 'F'
    }
    println(grade)


}