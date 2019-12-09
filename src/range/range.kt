package range

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
 * Complete the 'isNumberInRange' function below.
 *
 * The function is expected to return a BOOLEAN.
 * The function accepts following parameters:
 *  1. INTEGER lower
 *  2. INTEGER upper
 *  3. INTEGER numToCheck
 */

fun isNumberInRange(lower: Int, upper: Int, numToCheck: Int): Boolean {
    var x= false

        if(numToCheck in lower..upper)
            x=true
        else
            x=false

    return x
}

fun main(args: Array<String>) {
    val lower = readLine()!!.trim().toInt()

    val upper = readLine()!!.trim().toInt()

    val numToCheck = readLine()!!.trim().toInt()

    val result = isNumberInRange(lower, upper, numToCheck)

    println(result)
}
