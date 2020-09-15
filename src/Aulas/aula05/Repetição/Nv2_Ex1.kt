/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Aula 5: Exercícios Repetição

    Nível 2 - Exercício 1:  Faça um programa que calcule e mostre a média aritmética de N notas.
*/

package Aulas.aula05.Repetição

fun main(){
    println("--- O programa calcula a média aritmética de números inteiros utilizando somente loops ---")
    println("Informe a quantidade de números inteiros desejada: ")
    val qtdNumeros = readLine()!!.toInt()
    var soma: Int = 0
    for(i in 1..qtdNumeros){
        println("Informe o ${i}º número: ")
        soma += readLine()!!.toInt()
    }
    println("A média aritmética é ${soma/qtdNumeros}.")
}