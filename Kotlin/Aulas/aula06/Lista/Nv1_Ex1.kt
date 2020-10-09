/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Aula 6: Exercícios Lista

    Nível 1 - Exercício 1: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
*/

package Aulas.aula06.Lista

fun main(){
    val numeros = ArrayList<Int>(5)

    for (i in 1..5) {
        print("Informe o ${i}º número: ")
        numeros.add(readLine()!!.toInt())
    }
    numeros.forEach{println(it)}
}