import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*


fun sum(nums:Array<Int>, add: (Int, Int) -> Int?):Int {
    var res=0
    for(i in nums){
        res = add(res,i)!!
    }
    return res
}



fun getLambda(): (Int, Int) -> Int? {
   // var lambda = {a:Int,b:Int->a.(b)+b.plus(a)}// write your expression here
    val function = { a: Int, b: Int -> a.takeIf { a>=0 }?.plus(b.takeIf { b>=0 }!!) }
    var lambda = function

        return lambda
}


fun main(args: Array<String>) {
    val numsCount = readLine()!!.trim().toInt()

    val nums = Array<Int>(numsCount, { 0 })
    for (i in 0 until numsCount) {
        val numsItem = readLine()!!.trim().toInt()
        nums[i] = numsItem
    }

    val lambda = getLambda()
    val result = sum(nums,lambda)
    println(result)
 /*   var s:Int=2
    println(s.minus(s))*/
}
