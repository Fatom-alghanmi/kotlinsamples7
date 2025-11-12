package org.example

fun main() {

    var multiplyLambda = { a: Int, b: Int -> Int
        a * b
    }

    multiplyLambda = { a, b -> // Shorthand version
        a * b
    }

    val lambdaResult = multiplyLambda(4, 2)

    println(lambdaResult)

}

