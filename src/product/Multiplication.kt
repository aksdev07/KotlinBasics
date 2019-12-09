package product

import sun.security.jgss.GSSToken.readInt
import java.io.*;
import java.util.*
import java.text.*
import java.math.*
import java.util.regex.*
import kotlin.time.times

/*fun productCal(a:Int?=2, b:Int?=2){
    var c= b?.let { a?.times(it) }
    println(c)
}
fun main(args: Array<String>) {
    *//* Enter your code here. Read input from STDIN. Print output to STDOUT *//*
    val x = readLine()?.toInt()!!
    val y = readLine()?.toInt()!!
    productCal(5,5)
    productCal(x,y)
    productCal(b=9)
}*/
fun product(a:Int?=7, b:Int?=19):Int?{
    var c = b?.let{a?.times(it)}
    return c
}
fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    val x = readLine()!!.trim().toInt()
    val y = readLine()!!.trim().toInt()
    println(product(5, 5))
    println(product(x, y))
    println(product(b = 9))
}

