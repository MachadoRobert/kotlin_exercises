
import oop_exercises.*

fun main() {
    val person1 = Person()
    val person2 = Person()

    person1.name = "Robert"
    person1.age = 26

    person2.name = "Josilene"
    person2.age = 26

    println(person1.getInfo())
    println(person2.getInfo())
}