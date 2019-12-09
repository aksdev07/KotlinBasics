package stringTemplate

import kotlin.io.*


/*
 * Complete the 'templateIt' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING input as parameter.
 */

fun templateIt(input: String): String {
    var s="The string $input is of ${input.length} characters length"
    return s
}
fun main(args: Array<String>) {
    //val input = readLine()!!

  //  val result = templateIt(input)
/*    val rangeTo = 'a'.rangeTo('e')
    println(rangeTo);*/
   // println(result)
  /*  for (i in 1..3) {
        loop@ for (j in 4..5) {
            print("$i$j")
            if (j==4) break@loop
        }}*/
  /*  loop@ for (i in 1..3) {
        for (j in 4..5) {
            print("$i$j")
            if (i==2) continue@loop
        }}*/
    /*loop@ for (i in 1..3) {
        for (j in 4..5) {
            print("$i$j")
            if (i==2) break@loop
        }}*/
    loop@ for (i in 1..3) {
        for (j in 4..5) {
            print("$i$j")
            if (i==2) continue@loop
        }}
}
