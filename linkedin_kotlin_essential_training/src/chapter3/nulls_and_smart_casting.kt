package chapter3//package chapter3._03_05.begin

data class Person(var firstName: String, var lastName: String)

fun main() {
    /* NOTES:
    * For the other kind of languages, for example, a string can hold a null value,
    * but it has to be checked if it's a null when using it.
    *
    * In Kotlin, only nullable type can hold null.
    * Define a nullable type by adding a question mark (?) at the end of a non-nullable type
    */

    //val person1: chapter3.Person = null
    val person2: Person? = null

    /* if you define a nullable variable for a non-nullable type by putting ? at the end,
    then you'll need to check if it's null.

    printing the following statement won't complain even if there's no if statement since
    it's a legit operation originally.
     */
    val greeting: String? = null
    if (greeting != null) {
        println("Joe says: $greeting")
    }

    //println("greeting length = ${greeting.length}") // --> this won't work since greeting could be null
    println("greeting length = ${greeting?.length}")

    /* you can use the safe call operator as many times as necessary! */

    /* The Elvis operator (?:) is a handy companion to the safe call operator:
    * it returns the expression on the left if it's not null;
    * otherwise, it returns the right side.
    * Also, if the left side is not null, the right side won't be evaluated.
    *
    * One common usage is as a default value*/
    val len = greeting?.length ?: 20
    println("Length = $len")


    /* The not-null assertion operator (!!). Like the safe call operator, you place it before the dot.
       It tells Kotlin: leave me alone, I know what I'm doing.
     */

    //val badLen = greeting!!.length  //--> this code will crash if greeting is null
                                    //    since Kotlin is not checking if it's null for you anymore.

    /* safe cast:
    *  it allows you to cast, but it returns a null if the cast is not allowed
    *  (It probably won't be used often) */
    val safeGreeting: String? = greeting as? String

}
