package lambda

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
 * Create the 'minmax' function below.
 */

/*fun minmax(num:Array<Int>,filter:(b:Int,c:Int)->Boolean):Int{
    var i:Int=0
    var x:Int=0
    for(i in 0 until (num.size-1)){
        if(filter(num[i],num[i+1]))
            x=num[i]
        else
            x=num[i+1]
    }

    return x

}*/
fun minmax(num: Array<Int>, filter: (b: Int, c: Int) -> Boolean): Int {
    var i: Int = 0

    var n = num[0]
    for (i in 0 until (num.size)) {
        if (filter(num[i], n))
            n = num[i]

    }

    return n

}


/*var lambda =  {a:Int,b:Int -> a>b}
* var nums = [1,2,3,4]
*minimax(nums,lambda) should return 4 (max of all)
* */

fun main(args: Array<String>) {
    val numsCount = readLine()!!.trim().toInt()

    val nums = Array<Int>(numsCount, { 0 })
    for (i in 0 until numsCount) {
        val numsItem = readLine()!!.trim().toInt()
        nums[i] = numsItem
    }

    val type = readLine()!!.trim().toInt() != 0
    var lambda = { a: Int, b: Int -> a > b }
    if (!type) {
        lambda = { a: Int, b: Int -> a < b }
    }
    val result = minmax(nums, lambda)

    println(result)
}