package chapter4//package chapter4._04_03.begin

fun main() {
    /* Sets automatically remove the duplicates */
    // Kotlin makes lots of the methods names to be the same among collections

    // Create a set (immutable):
    val threes = setOf(3, 3, 3, 3, 3)
    println("The set threes is $threes")
    println("The size of threes is ${threes.size}")
    // Use contains() to see if an element is in the set:
    println("Has a 4? ${threes.contains(4)}")

    // Create a mutable set:
    val fset = mutableSetOf(1, 2, 3, 4, 5)
    val bset = mutableSetOf(5, 4, 3, 2, 1)
    // Set can also have an order
    println("First equal? ${fset.first() == bset.first()}")
    // Ordering of the set is irrelevant to their equivalency
    println("fset == bset? ${fset == bset}")
    // Add element to mutable set:
    println("Added 6 to fset? ${fset.add(6)}")
    // Delete
    println("Removed 76 from fset? ${fset.remove(76)}")

    // Another version of the set called "hash set" which doesn't preserve ordering and uses less memory
    // Create a mutable hash set:
    val fset2 = hashSetOf(1, 2, 3, 4, 5, 5)
    val bset2 = hashSetOf(5, 4, 3, 2, 1)
    // Set can also have an order
    println("First equal? ${fset2.first() == bset2.first()}")
    // Ordering of the set is irrelevant to their equivalency
    println("fset2 == bset2? ${fset2 == bset2}")

    /* Comparison and conversion between lists and sets */
    // While both sets and lists have first() and last() methods, you cannot index sets and it doesn' have get()
    // Convert from list to set or set to list use toSet() or toList() respectively.
    println()
    val aList = fset2.toList() // Note: if the original set has duplicates, then toList() will remove the duplicates as well
    println("Converted set is: $aList")

}
