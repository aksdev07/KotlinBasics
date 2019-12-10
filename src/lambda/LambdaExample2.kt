package lambda

fun main(args: Array<String>) {

    val square = {num:Int->num*num}
    val plus =   {num:Int->num+num}
    val minus =  {num:Int->num-num}
    val divQ =   {num:Int->num/num}
    val divR=    {num:Int->num%num}
    println(square(5))
    println(plus(3))
    println(minus(5))
    println(divQ(5))
    println(divR(5))
}
