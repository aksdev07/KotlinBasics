package lambda

import java.util.Arrays.toString

fun main() {
    var c: Int = 0
    var x: String = "aeaet"
    var y: String = "aeaet"
    var n: String = x+y
    println(n)
// n = aeaetaeaet
    var m = charArrayOf('a', 'e', 'a', 'e','t','i')

    var f=n[0]
    var j:Int=1
   // println(f)

    for(i in 0..n.length-1){
       for (j in i..n.length-1) {
           println("Inside 2nd for")
           if (f == n[j+1]) {

               m[c]=f
               println(m[c])
               f=n[j]
               c++
           }

       }

}
    for(l in 0..m.lastIndex)
    println(m[l])
}


