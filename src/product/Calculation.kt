import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*


/*
    Create KotlinMath class and add specified members with return values.
*/
class KotlinMath{
    fun addition(x:Int?,y:Int?):Int?{
        var c = y?.let{x?.plus(it)}
        return c
    }
    fun subtraction(x:Int?,y:Int?):Int?{
        var c = y?.let{x?.minus(it)}
        return c
    }
    fun multiplication(x:Int,y:Int):Int{
        var c = y?.let{x?.times(it)}
        return c
    }
    fun division(x:Int?,y:Int?):Int?{

        var c = y?.let{x?.div(it)}
        return c
    }

}

fun main(args: Array<String>) {
    val a = readLine()!!.trim().toInt()

    val b = readLine()!!.trim().toInt()

    val op = readLine()!![0]

    var kMath = KotlinMath()
    when(op){
        '+' ->  println(kMath.addition(a,b))
        '-' ->  println(kMath.subtraction(a,b))
        '*' ->  println(kMath.multiplication(a,b))
        '/' ->  println(kMath.division(a,b))
        else ->{println(null)}
    }
/* var c = 1

        if (x != null) {
            if(x> y!!) {
                c = x?.let { y?.div(it) }
            }
        }
        else{
            if (y != null) {
                if (x != null) {
                    if (x< y!!)
                        c = y?.let { x?.div(it) }
                }
            }
        }*/
}
