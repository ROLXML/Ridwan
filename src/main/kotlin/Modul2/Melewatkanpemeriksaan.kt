package Modul2

fun main(args: Array<String>) {
    //Null safety
    //The !! operator
    var maybeNumber: Int? = 15
    println(maybeNumber!! * 2)
    maybeNumber = null
}