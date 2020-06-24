package chapter6

fun main() {
    // To build a lambda function:
    // it starts with either var / val
    // then the name of the function (in this case, it's "lam")
    // since lambda is a function, we need to define the type for the arguments (inside ()) and returns (after ->)
    // the expression body is surrounded by {}
    val lam: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println("Sum = ${lam(5, 10)}")

    // But we don't need data types on both sides:
    val lamShort = {a: Int, b: Int -> a * b}
    // There are two methods to invoke a lambda function:
    println("Production of 5 and 10: ${lamShort(5, 10)}")
    println("Production of 50 and 10 (another invoke method): ${lamShort.invoke(50, 10)}")

    val num = listOf(1, 5, 7, 9, 10, 13)
    println(num.filter{it < 7})

    // In the case below:
    // after we define the variable, we have the class String
    // and we inform the world that we are extending the String class
    // (the . and () let us know that there's no parameters for this lambda function
    // the -> and String let us know that we return a String
    // inside the expression body, we only have a String template with "this"
    // "this" is the reference to the object that the lambda was invoked on
    val greet: String.() -> String = { "What's up $this?" }
    println("Troy".greet())

}
