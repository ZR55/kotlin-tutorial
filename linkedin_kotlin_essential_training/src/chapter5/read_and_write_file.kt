package chapter5

import java.io.File

fun main() {
    val res = "./resources" // res variable points to the resources directory
    val pets = "pets.txt"
    val pFile = File("${res}/$pets")

    val file = File("$res/text.txt")
    file.forEachLine { println(it) }

    val writeFile = File("$res/write.txt")
    writeFile.writeText("Kotlin = happiness")

    val pList = listOf("cat", "dog", "bird", "haha")
    pFile.writeText("")
    pList.forEach{ pFile.appendText("$it\n")}

    val newPets = mutableListOf<String>()
    pFile.forEachLine { newPets.add(it) }
    println()
    println(newPets)

    val exists = pFile.exists()
    println("\npets exists? $exists")
}


