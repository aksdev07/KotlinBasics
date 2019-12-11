package lambda

import java.util.Arrays.toString

fun main() {
    var c:Int=0
    var x:String="aeae"
    var y:String="aeae"
    var n: String ="AN"
    n="jffd"
    println(n)
    var m = charArrayOf()
 /*   for (k in m.indices) {
        m[k] = 'j'
        println(m[k])
    }
    n=String(m)
    println(n)*/
    for (i in x.indices) {
        for (j in y.indices) {
            if (x[i] == y[j]) {
                for (k in n.indices) {
                    if (m[k] != y[j]) {
                       m[k]=y[j]
                    }

                }
                c++
            }
        }

    }
    println(m)
}
