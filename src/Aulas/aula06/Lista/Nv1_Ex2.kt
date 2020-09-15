/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Aula 6: Exercícios Lista

    Nível 1 - Exercício 2:  Faça um Programa que leia um vetor de 10 números e mostre-os na ordem inversa.
*/

package Aulas.aula06.Lista

fun main(){
    val numeros = ArrayList<Int>(10)

    for (i in 1..10) {
        print("Informe o ${i}º número: ")
        numeros.add(readLine()!!.toInt())
    }
    numeros.reverse()
    numeros.forEach{println(it)}
}