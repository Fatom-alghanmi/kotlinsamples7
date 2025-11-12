package org.example

fun main() {
   var intro = printName("Fatom") // calling or invoking the function
    println(intro)
}

fun printName() { // function definition
    println("My name is Fatom")
}

fun printName(name: String): String {
    println("my name is $name")
    var greeting = "Hello $name, how are you?"
    return greeting
}