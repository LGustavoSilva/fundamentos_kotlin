package com.luiz.fundamentoskotlin

class ParOuImpar {
}
fun main() {
    var numero = 9
    var parImpar: String

    parImpar = if(numero % 2 == 0) "par" else "impar"
    println(parImpar)
}