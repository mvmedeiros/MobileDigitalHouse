/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Aula 5: Exercícios Repetição

    Nível 2 - Exercício 2: Faça um programa que calcule o valor total investido por um colecionador em sua
                           coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar
                           a quantidade de CDs e o valor para em cada um.

*/

package Aulas.aula05.Repetição

fun main(){
    println("--- O programa calcula o investimento em uma coleção de CDs ---")
    print("Informe a quantidade de total CDs: ")
    val quantidade = readLine()!!.toInt()

    var total: Double = 0.0
    var custo: Double

    for(i in 1..quantidade) {
        print("Informe o valor do ${i}º CD: ")
        custo = readLine()!!.toDouble()
        total += custo
    }
    println("Total investido na coleção: R$ $total.")
    println("O valor médio é: R$ ${total/quantidade}.")
}