package chapter5

/*
* In the previous exercises, we didn't give any arguments to the function, but we can.
*
* The argument type MUST be a string. If the argument type originally is not, then you need to convert it to string*/

fun main(args: Array<String>) {
    // check function has any arguments:
    if(args.any()) {
        println("The string = ${args[0]}")
    }

    // This method works fine if the input is only a few strings.
    // It can be challenging to deal with complicated inputs.
    // But there are some open source tools to help with this, like "kotlinx.cli" (https://github.com/Kotlin/kotlinx.cli)
    for (arg in args) {
        println("each argument is $arg")
    }

}
