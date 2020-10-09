/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Aula 6: Exercícios Lista

    Nível 1 - Exercício 3: Faça um Programa que peça a altura de 5 pessoas, armazene cada informação num array.
                            Imprima a altura na ordem inversa a ordem lida.
*/

package Aulas.aula06.Lista

fun main(){
    val alturas = ArrayList<Double>(5)
    println("O programa recebe 5 entradas de altura e exibe-as na ordem inversa.")
    for (i in 1..5) {
        print("Informe a ${i}ª altura: ")
        alturas.add(readLine()!!.toDouble())
    }
    alturas.reverse()
    alturas.forEach{println(it)}
}