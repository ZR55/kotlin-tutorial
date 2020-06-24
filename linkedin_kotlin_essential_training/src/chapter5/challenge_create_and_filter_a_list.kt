package chapter5

import java.io.File

/* Task:
*  Read the file sales.txt which is in the resources directory and contains a series of floating points.
*  Add them into a double list but pay attention to the inputs that are not good. Need to filter out the invalid value*/

fun main() {
    val res = "./resources"
    val input = File("$res/sales.txt")
    val salesList = mutableListOf<Double>()

    // My solution:
    /*
    input.forEachLine { salesList.add(it.toDoubleOrNull() ?: 0.0)  }
    println(salesList.filter{it != 0.0})
     */

    // Better solution:
    input.forEachLine {
        val checkDouble = it.toDoubleOrNull()
        if (checkDouble != null) {
            salesList.add(checkDouble)
        }
    }
    for (item in salesList) println(item)
}
