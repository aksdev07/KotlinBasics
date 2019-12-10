package lambda

fun main(args:Array<String>){
    val arr= arrayOf(5,5)
    println(equal(arr, { a, b -> a == b }))
}

//Here equal(parameters) is a high-order function
fun equal(num:Array<Int>,filter:(a:Int,b:Int)->Boolean):Int{
    if (filter(num[0],num[1])) return num[0]
    return num[1]
}