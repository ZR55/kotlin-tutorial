package chapter4//package chapter4._04_01.begin

data class Student(val firstName: String, val grade: Int)

fun main() {
    /* NOTES:
     * Arrays are used to store fixed-sized items.
     * Lists can be resized while arrays cannot be.
     *
     * Arrays are always boxed which means that each element is always an object, never a primitive,
     * even when holding, for instance, integer. Boxing makes accessing the values slower.
     * There is a primitive type of arrays that don't have the boxing penalty.
     * They are named for their primitive type combined with Array. So there is an intArray, byteArray, shortArray, etc.
     * Each array has a corresponding creation function. E.g. intArrayOf()
     * This makes list is preferable to array
     *
     * To initialize an array: use "arrayOf" function
     */
    val things = arrayOf(1, 2, 3, "one", "two", "three")
    // Change items in the array:
    things[0] = "zero"
    // To display the items in the array
    for (thing in things) println(thing)

    /* To initiate an array with single type:
     * append the type in angle brackets before the parameter list*/
    val students = arrayOf<Student>(Student("Daisy", 9), Student("Rui", 8))
    // Change items in the array:
    students[0] = Student("Ben", 10)
    // Display the students array:
    for (student in students) println(student)

    /* Another way to initialize an array is using an array constructor
    * The initializer function can be either a lambda or an existing function
    * This example uses the function chapter4.fiver below
    * To pass an existing function, use the member reference operator (::) */
    val fives = Array(5, ::fiver)
    // Display each item by using "forEach()" function
    fives.forEach { println(it) }
    // Array has few associated properties:
    // size: gives the number of element in the array
    println("fives has ${fives.size} elements")
    // indices: holds a range which is the valid indices of the array
    println("indices = ${fives.indices}")
    // lastIndex: retrieves the last index in the array
    println("lastIndex = ${fives.lastIndex}")

    // Initialize a primitive type array
    val pInts = intArrayOf(1, 2, 3)
}

fun fiver(index: Int): Int{
    return index * 5;
}
