package chapter6

fun replicate(func: (Int, String) -> Unit) {
    /*fun func(times: Int, word: String): Unit {
        for (i in 0..times) {
            println(word)
        }
    }
    return func(3, "Be Cool.")*/
    func(5, "Be Cool.")
}

fun main() {
    // call replicate() here
    replicate {count, message ->
        for (index in 1..count) println(message)
    }
}
