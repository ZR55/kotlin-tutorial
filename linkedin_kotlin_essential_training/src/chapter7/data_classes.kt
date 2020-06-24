package chapter7

//class Student(val firstName: String, val lastName: String, val grade: Int) {
//    override fun toString(): String {
//        return "($firstName $lastName $grade)"
//    }
//
//    // "other" refers to the other student in the class
//    override fun equals(other: Any?): Boolean {
//       if (other is Student) {
//           return lastName == other.lastName &&
//                   firstName == other.firstName &&
//                   grade == other.grade
//       }
//        return false
//    }
//
//    override fun hashCode(): Int {
//        var result = firstName.hashCode()
//        result = 31 * result + lastName.hashCode()
//        result = 31 * result + grade
//        return result
//    }
//}

// We CANNOT make a copy of the object in the class using the above method to define the class.
// However, if the class is a data class, we don't even need to override either toString() or equals() function
// and also we will be able to make copies of objects
data class Student(val firstName: String, val lastName: String, val grade: Int)


/*
* DTO = Data Transfer Object
* DTO is used to move data into and out programs*/

fun main() {
    val students = mutableListOf<Student>(
            Student("abel", "baker", 11),
            Student("abel", "baker", 11),
            Student("delta", "echo", 12)
    )
    println()
    println(students[0])

    // Check if there are duplicates for the objects:
    println("Does ${students[0]} == ${students[1]}: ${students[0] == students[1]}")
    // They are not identical since Kotlin recognize two objects are identical only
    // when they both reference the same memory location
    // However, we can override another function "equal"

    val charlie = students[0].copy(firstName = "Charlie")
    students.add(charlie)
    for(student in students) println(student)
}
