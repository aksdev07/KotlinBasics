package arrayprint

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
 * Complete the 'printWhole' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun printWhole(n: Int): Unit {
val a = IntArray(n)
    for(item in a.indices) {
        println(item)
    }

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    printWhole(n)
}
