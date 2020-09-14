/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Lista de exercícios: Introdução a Kotlin e estrutura básica

    3) Escrever o código que deve analisar um número inteiro e, caso ele seja par, retornar true, caso
    contrário, retorna false.

*/

fun main(){
    println("-- O programa analisa um número inteiro e informa se o mesmo é par ou ímpar --")
    println("Informe um número inteiro: ")
    val numero = readLine()!!.toInt()

    if(parOuImpar(numero))
        println("O número informado é par.")
    else
        println("O número informado é ímpar.")
}

fun parOuImpar(numero: Int):Boolean{return (numero % 2 == 0)}
