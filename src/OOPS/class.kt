
class DailyTask(hourparm:Int,name:String){
     lateinit var stepsgoal : String


//     Getter and setters
     val name = name
    get(){
        return field.toUpperCase()
    }

     var hours = hourparm
        set(value){
          if (value in 1..24) {
              field=value
          }
            else println("Please go and do some work")
          }

    fun wake(){
        println("wake up early in the morning")
    }
    fun Ibadda(){
        println("Do wadu and say prayer")
    }
    fun DSALecture(){
        println("Continue your DSA lecture")
    }
    fun walk(){
        println("Today $name walked $stepsgoal steps which is my goal")
    }


}


fun main(){
val hassan=DailyTask(0,"Hassan")
    hassan.stepsgoal=" 50 "
    hassan.wake()
    hassan.Ibadda()
    hassan.DSALecture()
    hassan.walk()
}