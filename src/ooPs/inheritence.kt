open class SortAlgo() {

      fun Quicksort() {
          println("Quicksort has time complexity : O(logN)")
      }

      fun Mergesort() {
          println("MergeSort has time complexity : O(logN)")

      }

}
  class jobi():SortAlgo(){
    fun jb(){
        println("Ja ja tur ja Tanu yad he kuj ni aa rya")
    }
     fun Inheritence(msg:String){
         println(message = "Inheritance is nothing but when a class coppies encapsulated data of another class this method or this process is called Inheritence")

     }

}
fun main (){
    val srt=jobi()

    srt.Mergesort()
    srt.jb()
    srt.Inheritence("By the way this function is also executing because of inheritence")
}