package inheritance



open class Employee(age:Int, name:String, tech:String){
    var name : String
    var tech:String
    init {
        this.name=name
        this.tech=tech
        println("The name of the Employee is ${this.name} and the age is $age. He is woking in ${this.tech}")
    }

}

class Developer(age:Int , name:String, tech: String):Employee(age,name,tech){
    fun develope(){



    }
    fun kd(): Unit {
        print("Inside Developer Class")
    }
}
fun main(args:Array<String>){
    val d=Developer(24,"Anuj","Selenium")
    d.kd()
}