package vowelreturnlabel

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*



/*
 * Complete the 'printNonVowels' function below.
 *
 * The function accepts STRING str as parameter.
 */

fun printNonVowels(str: String): Unit {
   /* inner@for(i in str.indices){
        print(str[i])
        if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u') return@inner
        print(str[i])
    }*/
  /*  inner@for(letter in str) {
        // Write code to perform the action with letter….
        if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u') return@inner
        print(letter)
    }*/

    str.forEach inner@ {
        if (it == 'a'||it == 'e'||it == 'i'||it == 'o'||it == 'u') return@inner

        println(it)
    }




}

fun main(args: Array<String>) {
    val str = readLine()!!

    printNonVowels(str)
}
