/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Aula 6: Exercícios Funções

    Nível 1 - Exercício 2: Faça um programa, com uma função que necessite de um argumento. A função
                           retorna o valor de caractere ‘P’, se seu argumento for positivo, e ‘N’, se seu
                           argumento for zero ou negativo.


*/

package Aulas.aula06.Função

fun main(){
    println(polaridade(10))
    println(polaridade(-10))
}

fun polaridade (numero:Int) = if (numero > 0) 'P' else 'N'