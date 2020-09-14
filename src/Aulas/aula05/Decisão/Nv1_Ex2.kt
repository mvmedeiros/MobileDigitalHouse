/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Aula 5: Exercícios Decisão

    Nível 1 - Exercício 2: Faça um Programa que peça um número inteiro e determine se ele é par ou
                           ímpar. Dica: utilize o operador módulo (resto da divisão).
*/

package aula005

fun main() {
    println("------ NÍVEL 1 - EXERCÍCIO 2 ------")
    println("Digite um número inteiro: ")
    val numeroInteiro = readLine()!!.toInt()
    if (numeroInteiro %2 == 0) {
        println("É PAR")
    } else {
        print("É ÍMPAR")
    }
}