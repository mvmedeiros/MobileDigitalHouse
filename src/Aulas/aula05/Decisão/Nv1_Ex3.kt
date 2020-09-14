/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Aula 5: Exercícios Decisão

    Nível 1 - Exercício 3: Faça um programa para a leitura de duas notas parciais de um aluno. O
                           programa deve calcular a média alcançada por aluno e apresentar:
                           A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
                           A mensagem "Reprovado", se a média for menor do que sete;
                           A mensagem "Aprovado com Distinção", se a média for igual a dez.
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