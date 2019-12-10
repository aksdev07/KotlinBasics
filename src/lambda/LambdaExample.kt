package lambda

fun main(args: Array<String>) {
    val arr = arrayOf(10,50)
    //println(max(arr,{c,d -> c>d}))
    println(max(arr) { a, b -> return@max a >=0 })
   // println(arr.filter { it > 10 })

}
fun max(nums:Array<Int>,filter: (a:Int,b:Int) -> Boolean):Int {
    if(filter(nums[0],nums[1])) return nums[0]
    return nums[1]
}
