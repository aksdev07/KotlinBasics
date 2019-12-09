package `class`

class Employee {
    // property (data member)
    private var tagged: Boolean = false

    // member functions
    fun allocated() {
        tagged= true
    }
    fun unallocated() {
        tagged= false
    }
    fun displayEmployeeAllocation(str:String){
        if(tagged==true){
            println("$str is allocated")
        }
        else
            print("$str is not allocated")
    }
}
fun main(args: Array<String>) {

    val e1 = Employee() // create e1 object of Employee class
    val e2 = Employee() // create e2 object of Employeeclass
    e1.allocated()
    e2.unallocated()
    e1.displayEmployeeAllocation("Anuj")
    e2.displayEmployeeAllocation("Raj")
}