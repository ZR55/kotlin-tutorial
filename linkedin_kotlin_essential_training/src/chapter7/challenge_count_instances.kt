package chapter7

class Bosco {
    // Since we need to keep track of information from outside of a single class, we need a companion object
    companion object {
        private var count = 0
        fun increment() {
            count ++
        }
        fun show() {
            println("$count instances created.")
        }

    }

    init {
        increment()

    }
}

fun nop() {
    val b = Bosco()
}

fun main() {
    val b1 = Bosco()
    val b2 = Bosco()
    nop()
    val b3 = Bosco()
    Bosco.show()
}
