package chapter6

fun main() {
    val words = listOf("racecar", "civic", "level", "butter")
    for (word in words) {
        println("Palindrome $word? ${isPalindrome((word))}")
    }
}

/*
* A local function is the one that resides within another function.
* It has access to all the local variables of the outer function and is not callable outside of the outer function
* Why do we need them?
* They are an alternative to littering your code with function called only by one other function or worse having
* all including mega-functions
* They can also be an alternatives to creating a class, which may be overkill for a small need*/


fun isPalindrome(word: String): Boolean {
    fun doCharsMatch(front: Int, back: Int): Boolean {
        if (front >= back) return true
        if (word[front].toUpperCase() != word[back].toUpperCase()) return false
        return doCharsMatch(front + 1, back - 1)
    }
    if (word.length < 2) return true
    return doCharsMatch(0, word.lastIndex)
}
