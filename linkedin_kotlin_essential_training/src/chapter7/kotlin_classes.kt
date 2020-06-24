package chapter7

/*
* Classes:
* classes are public by default.
* We change their visibility by adding private, protected, internal, or the redundant public before the class keyword */
class PlainShort {

}

class ShortClass

class WithConstructor constructor(name: String, age: Int) {}

class WithoutConstructor (name: String, age: Int) {}

class MandatoryConstructor internal constructor(name: String, age: Int) {}

class CourseProperty(courseTitle: String) {
    val title = courseTitle
}

// if the class's parameters are identical to the properties it needs, we can cut out the middleman.
// For every parameter that we'd like as a property, we add either the var or val keyword.
// We don't have to make ALL the parameters into properties
// In the example below, firstName and age are parameters that are used as properties
// while firstName is immutable and age is mutable.
class Person(val firstName: String, lastName: String, var age: Int) {}

// custom getter, setter
class Course(courseTitle: String) {
    private val title = courseTitle
    internal var description = ""
    get(){
        return if (field.isNullOrBlank()) "no description" else "$field"
    }

    fun show() {
        println(title)
    }

    override fun toString(): String {
        return "$title - $description"
    }
}

fun main() {
    val course = Course("Kotlin Essential Training")
    course.description = "secrets you want to know"
    course.show()
    println(course)
}
