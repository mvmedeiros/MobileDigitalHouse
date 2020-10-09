/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Aula 5: Exercícios Repetição

    Nível 1 - Exercício 2: Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
*/

package Aulas.aula05.Repetição

fun main(){
    for(i in 1..50){
        if(i % 2 != 0)
            print(i)
    }
}