package com.luiz.fundamentoskotlin

class VarMutavel {
}

fun main() {
    var mutavel = 6
    var novoValorMutavel = 5

    println("Mutavel: "+ mutavel + ". Novo valor mutavel: " + novoValorMutavel)

    mutavel = novoValorMutavel
    println("-Após a alteração-")
    val template = "Mutavel: $mutavel. Novo valor mutavel:  $novoValorMutavel"
    println(template)
}