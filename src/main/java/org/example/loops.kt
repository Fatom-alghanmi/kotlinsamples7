package org.example

fun main() {
    var sum = 1

    while (sum < 1000) {
        sum = sum + (sum + 1)
        println(sum)
    }
    println("The loop is finished and sum is $sum")

     var sum2 = 1000
     do {
         sum2 =sum2 + (sum2 + 1)
         println(sum2)

     } while (sum2 < 1000)
    println("The loop is finished and sum is $sum2")

    val count = 5

    var sum3 = 1

     for (i in 1 .. count) {
         sum3 = sum3 + i
         println(sum3)
     }
println("The loop is finished and sum3 is $sum3")

    var sum4 = 1

    for (i in 3..5) {
        sum4 = sum4 + i
        println(sum4)
    }
    println("The loop is finished and sum3 is $sum4")

    }