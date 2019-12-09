package product

import kotlin.time.times

class MultiplicationUsingClass {
   fun product(a:Int?,b:Int?){
        var c= b?.let { a?.times(it) }

        print(c)
    }
}
fun main(args:Array<String>){
   val obj = MultiplicationUsingClass()
    obj.product(2,3)
}