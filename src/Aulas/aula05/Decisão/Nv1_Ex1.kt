/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Aula 5: Exercícios Decisão

    Nível 1 - Exercício 1: Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a
                           letra escrever: F - Feminino, M - Masculino, Sexo Inválido.

*/

package aula005

fun main() {
    println("------ NÍVEL 1 - EXERCÍCIO 1 ------")
    println("Qual o seu sexo? ")
    val sexo = readLine()!!.toLowerCase()
    when(sexo){
        "f" -> println("FEMININO")
        "m"-> println("MASCULINO")
        else -> println("Sexo inválido")
    }
}