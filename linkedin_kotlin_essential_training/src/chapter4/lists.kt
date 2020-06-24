package chapter4//package chapter4._04_02.begin

fun main() {

    /*
    * Three chapter4.chapter3.main collection types in Kotlin:
    * Lists: an ordered collection of elements
    * Sets
    * Maps
    *
    * All the collections come in two varieties: read-only or mutable
    * It's good to think collections as boxes.
    * You are not able to remove or add any items into read-only collections
    * while you are free to play around with items inside of the mutable collections
    *
    * The variable types:
    * val (mutable): it can be used to point at any box (collection) of items
    * var (immutable): it can be only used to point at the original box (collection) */

    /* List */
    // Initialize a list:
    val names = listOf("Daisy", "Tom", "Rob", "Tyler")
    // Access elements: get method/preferred index accessor
    // get method:
    println("The first name is ${names.get(0)} (get method)")
    println("The first name is ${names[0]} (index accessor)")
    // Create a mutable list name by using sublist
    var subNames = names.subList(1, 3)
    println(subNames)

    // Initialize a mutable list by using mutableListOf()
    val items = mutableListOf(2, 3, 4, 5, 6, 10, 10, 10, 10, 10, 14)
    // Change element
    items[0] = 1
    // Add items using add() method
    // Delete items using removeAt() which deletes the item at the past index;
    // Using remove() will delete the item and returns a boolean true if it's successful.
    items.add(12)
    items.removeAt(3)
    items.remove(99)    //--> won't throw an error, it will just return false since it exceeds the index
    println(items)
    println("The size of items is ${items.size}")
    // using list.first() to get the fist element in the list:
    println("The first element is ${items.first()}")
}

