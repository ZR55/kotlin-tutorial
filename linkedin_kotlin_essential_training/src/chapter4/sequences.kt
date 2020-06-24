package chapter4

fun main() {

    /*
    * Sequences:
    * Like collections, sequences are containers. They share many same functions and they are also iterable.
    *
    * In the following example, it doubled all the numbers which seems unnecessary.
    * Use asSequence() to convert a collection to a sequence
    *
    * Unlike collections, sequence is like a conveyor belt where each value goes through each step in the pipeline
    * before the next one and the sequence can end on any value. The good place to use a sequence is when you have
    * vast collections and lots of pipeline functions.
    *
    * One weird thing about sequence is that it requires a terminal operation to start working.
    * If there isn't one, they won't do anything
    * */

    /*val result = (100 until 200)
        .map { println("doubling $it"); it * 2 }
        .filter { println("filtering $it"); it % 3 == 0 }
        .first()
    println("results = $result")
    println()*/

    val result = (100 until 200).asSequence()
    .map { println("doubling $it"); it * 2 }
    .filter { println("filtering $it"); it % 3 == 0 }
    .first()
    println("results = $result")
    println()

    val myThrees = sequenceOf(1, 3, 5, 7, 9).filter{ it % 3 == 0 }
    println("myThrees = $myThrees")
    println("convert myThrees sequence to list: ${myThrees.toList()}")
}
