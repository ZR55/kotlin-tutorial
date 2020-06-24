package chapter7

class CantCreate private constructor(val message: String) {
    fun showMessage() {
        println(message)
    }

    // A class can ONLY have one companion object
    companion object {
        const val Light_Speed = 299_792_458
        fun factory (msg: String): CantCreate {
            return CantCreate(msg)
        }

        fun sillyPrint(self: CantCreate) {
            println("Accessing ${self.message}")
        }
    }
}

/*
* Companion Objects
* Why to use companion objects?
* 1. to scope properties and functions to a top-level scope, but avoid polluting the global name space
* 2. to provide static constants
* 3. to supply a class with a factory method*/

fun main() {
    val c1 = CantCreate.factory("Hello, there")
    c1.showMessage()
    CantCreate.sillyPrint(c1)
    println("The speed of light is ${CantCreate.Light_Speed} ms/s")
}
