/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Aula 5: Exercícios Decisão

    Nível 2 - Exercício 1:  Faça um Programa que peça um número inteiro e determine se ele é par ou
                            ímpar. Dica: utilize o operador módulo (resto da divisão).
*/

package aula005

fun main() {
    println("------ NÍVEL 1 - EXERCÍCIO 3 ------")
    println("Digite a nota 1: ")
    val nota1 = readLine()!!.toDouble()
    println("Digite a nota 2: ")
    val nota2 = readLine()!!.toDouble()
    val media = (nota1+nota2)/2
    if (media < 7) {
        print("Aluno reprovado!")
    } else if (media == 10.0) {
        print("Aluno aprovado com distinção!")
    } else {
        print("Aluno aprovado!")
    }
}