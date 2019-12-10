package lambda

fun main(args:Array<String>){
val arr = arrayOf(7,1)
    println(min(arr, { a, b -> a < b }))
}

fun min(num:Array<Int>,filter:(a:Int,b:Int)->Boolean):Int{
    if(filter(num[0],num[1])) return num[0]

    return num[1]
}