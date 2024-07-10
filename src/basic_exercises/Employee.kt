package basic_exercises

class Employee {
    //attribute
    var name: String = ""
    var age: Short = 0
    var gender: Char = 'm'
    var salary: Double = 0.toDouble()

    fun insertValues(name:String, age:Short, gender:Char, salary:Double ){
        this.name = name
        this.age = age
        this.gender = gender
        this.salary = salary
        println("Name of employee: ${this.name}")
        println("Age of employee: ${this.age}")
        println("Gender of employee: ${this.gender}")
        println("Salary of employee: ${this.salary}")
    }
    fun insertName (name: String){
        this.name = name
    }

}