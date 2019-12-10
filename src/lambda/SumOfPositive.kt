import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*


fun sum(nums: Array<Int>, add: (Int, Int) -> Int?): Int {
    var res = 0
    println("Inside sum")
    for (i in nums) {
        res = add(res, i)!!
    }
    return res
}


fun getLambda(): (acc: Int, ele: Int) -> Int {
    fun x(l:Int):Int{
        var c:Int=0
        if (l>=0)
            c=l
        else
            c=0
        return c
    }
    var lambda = { a: Int, b: Int ->x(a) + x(b) }
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
    val result = sum(nums, lambda)
    println(result)
    /*   var s:Int=2
       println(s.minus(s))*/
}
