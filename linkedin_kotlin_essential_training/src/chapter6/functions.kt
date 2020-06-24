package chapter6

fun main() {
    greeter("Troy")
    greeterShort("Rui")

    println("Volume with all given values: ${volume(2, 5, 7)}")
    println("Volume using default value is ${volume(10, 5)}")
    println("VolumeX with all given values: ${volumeX(29,5,2)}")
    println("VolumeX with default value is: ${volumeX(width = 13, height = 3)}")
    //println("test ${volumeX(4, 39)}") // --> it automatically say assign the two values as the first two
}

// traditional way of defining a function:
fun greeter(name: String): String {
    return  "Hello $name"
}

// Combine into one line:
fun greeterShort (name: String) = "Hello again $name"

// In the case below, 10 is the default value of height.
// When a value is given for height, then the function will use the given one,
// while 10, the default, will be used if there's no height value is given.
fun volume(length: Int, width: Int, height: Int = 10) = length * width * height

// When the default parameter is to the left of the non-default parameter,
// we can only use the default value by using named argument.
fun volumeX(length: Int = 10, width: Int, height: Int) = length * width * height
