package extensionfunction

fun String.toUpperChar(): String =  this.toUpperCase()
fun main(args: Array<String>) {
    val myString= "Anuj Kaushik"
    val result = myString.toUpperChar()
    println("$result")
}