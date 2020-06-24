package chapter4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 5, 6, 7, 7, 8)
    val set = setOf(10, 20, 30, 40, 50)
    val map = mapOf(1 to 10, 2 to 20, 3 to 30)

    /*
    * Collection Operations:
    * Transformations: creates a new collection from an older one.
    *                  The new one has the same number of elements as the old one
    * Filtering: it passes each member in the collection through a check.
    *            The members that get through the check will be put in a new collection while the others won't
    *            If there's no member pass the check, then there will be an empty collection.
    * Ordering
    * Retrieving an element
    * Retrieving a collection
    * Grouping
    * Aggregation
    * Plus and minus operators
    * */

    /* Transformation */
    val tList = list.map{ it * 2 }
    println("transformed list = $tList")
    val tMap = map.map{ Pair(it.key, it.value * 10) }.toMap()
    println("transformed map: $tMap")
    println()

    /* Filtering */
    val fList = list.filter{ it % 2 == 1 }
    println("only odds = $fList")
    val fSet = set.filter{it > 100}
    println("Is fSet empty? = ${fSet.isEmpty()}")
    println()

    /* Ordering */
    println("sorted descending set = ${set.sortedDescending()}")
    println()

    /* Retrieve element */
    println("tList last: ${tList.last { it < 15 }}")
    println()

    println("list to set: ${list.toSet()}")
    println("set to list: ${set.toList()}")

}
