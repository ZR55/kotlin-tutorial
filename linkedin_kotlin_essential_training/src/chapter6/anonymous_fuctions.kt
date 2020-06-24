package chapter6

fun main() {

    /*
    * An anonymous function is a function with no name
    *
    * We can use anonymous function instead of lambdas in collections, but lambda is a better choice
    *
    * Notes on anonymous function:
    * 1. if we need to return a value, we must use the return keyword
    * 2. if an anonymous function lacks a return, it returns the default Unit type
    * 3. if there's a disagreement between either the variable's type or the function's return type,
    *    then it's a compilation error
    * So prefer anonymous functions when there are more than one returns*/

    val num = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)
    val fNum = num.filter(fun(a: Int): Boolean {return a < 7})
    println(fNum)

    // We can also shorten anonymous function, but cannot be as short as lambda
    val fNum2 = num.filter(fun(a) = a < 7)
    println(fNum2)

    // The only time when anonymous function is better than lambda is when there are multiple returns:
    println()
    val getAge2 = lambda@{ age: Int ->
        if(age >= 65)
            return@lambda "senior discount"
        else if (age >= 21)
            return@lambda "regular"
        "underage"
    }
    println("(With lambda function) Client pays ${getAge2(32)} price")
    println()
    // Rewrite the above lambda function with anonymous function:
    // with anonymous functions, you can have as many returns as you want without using any labels
    val getAge = fun(age: Int): String {
        if (age >= 65)
            return "senior discount"
        else if (age >= 21)
            return "regular"
        return "underage"
    }
    println("(With anonymous function) Client pays ${getAge(70)} price")
}
