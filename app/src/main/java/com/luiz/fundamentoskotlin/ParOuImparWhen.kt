package com.luiz.fundamentoskotlin

class ParOuImparWhen {
}

fun main() {
    var numero = 8
    var parImpar: String

    parImpar = when {
        numero % 2 == 0 -> "par"
        else -> "impar"
    }
    println(parImpar)
}