package Override

open class Employee() {
    open fun displayId(id: Int) {
        println("Employee id is $id")
    }}
class Developer: Employee() {
    override fun displayId(id: Int) {
        println("Developer  id is $id ")
    }}
fun main(args: Array<String>) {
    val dev = Developer()
    dev.displayId(44)
}
