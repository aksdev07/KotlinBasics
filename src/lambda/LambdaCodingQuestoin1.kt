
package inheritance

fun sum(nums:Array<Int>, add: (Int, Int) -> Unit):Int {
    println("Inside sum")
    var res:Int=0
    for(i in nums){
        //res = add(res,i)
    }
    return res
}

fun sum(nums:Array<Int>){
    println("Inside overloaded fun")
    var c:Int=0
    for (i in nums){
        c += i.minus(i.unaryPlus())
        //c+=i.plus(i.unaryMinus())
    }
    println(c)


}

fun getLambda(): (Int, Int) -> Int {
  // var lambda = {a:Int,b:Int->a+b}// write your expression here  max(arr){a,b -> return@max a>b}
 /*  fun plu():Int{
      var c:Int

      return c
  }*/
 //var l = {x:Int->x>=0}
    var lambda = { a: Int,b:Int->a.plus((a.unaryMinus())+a)+b.plus(b.unaryMinus())}
    //var m= {a:Int,b:Int->l+b}
}

fun main(args: Array<String>) {
   /* val numsCount = readLine()!!.trim().toInt()

    val nums = Array<Int>(numsCount, { 0 })
    for (i in 0 until numsCount) {
        val numsItem = readLine()!!.trim().toInt()
        nums[i] = numsItem
    }*/

/*    val lambda = getLambda()
    val result = sum(nums,lambda)
    println(result)*/
    var s:Int=-5

   // println(s.plus(s))
    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     * 0 if a==other
     * -1 if a<other
     * 1 if a>other
     *
     * -a---> 0
     * a----> a
     */
    println(s.unaryMinus()+s)
    //+x.plus(x.unaryMinus()))
    // sum(nums)
}
