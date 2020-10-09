/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Aula 5: Exercícios Repetição

    Nível 1 - Exercícios 1: Faça um programa que leia 5 números e informe o maior número.
*/

package Aulas.aula05.Repetição

fun main(){
    var numeros = ArrayList<Int>(5)

    println("--- O programa recebe 5 números inteiros e informa qual o maior entre eles ---")
    for(i in 1..5){
        println("Informe o ${i}º número: ")
        numeros.add(readLine()!!.toInt())
    }
    println("O maior número informado é ${numeros.maxOrNull()}.")
}