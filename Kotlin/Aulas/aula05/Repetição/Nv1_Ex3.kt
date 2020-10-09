/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Aula 5: Exercícios Repetição

    Nível 1 - Exercício 3: Faça um programa que receba dois números inteiros e gere os números inteiros
                           que estão no intervalo compreendido por eles.
*/

package Aulas.aula05.Repetição

fun main(){
    println("--- O programa exibe os números inteiros dentro do intervalo determinado ---")
    println("Informe o limite inferior do intervalo: ")
    var limiteInferior = readLine()!!.toInt()
    println("Informe o limite superior do intervalo: ")
    var limiteSuperior = readLine()!!.toInt()

    if(limiteSuperior < limiteInferior){
        var aux = limiteInferior
        limiteInferior = limiteSuperior
        limiteSuperior = aux
    }
    for(i in limiteInferior..limiteSuperior)
        println(i)
}