
fun nullable(str:String?):Int{
    val x=str?.length?:-1
    return x
}
fun main(args: Array<String>) {
    val str = readLine()!!
    var result=-100
    if(str=="null"){
        result = nullable(null)
    }else
        result = nullable(str)
    println(result)
}
