package chapter4

fun main() {

    /* Task: render the collection without any duplicates */
    val animals =
        listOf("apple", "biscuit", "apple", "cat", "cat", "cat",
            "dog", "elephant", "fox", "goat", "elephant")

    println("Without duplicates ${animals.toSet()}")
}
