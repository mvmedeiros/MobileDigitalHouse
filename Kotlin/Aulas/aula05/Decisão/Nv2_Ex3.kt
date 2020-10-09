/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Aula 5: Exercícios Decisão

    Nível 2 - Exercício 3:  Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As
                            perguntas são:
                            "Telefonou para a vítima?"
                            "Esteve no local do crime?"
                            "Mora perto da vítima?"
                            "Devia para a vítima?"
                            "Já trabalhou com a vítima?"

                            O programa deve no final emitir uma classificação sobre a participação da pessoa
                            no crime. Se a pessoa responder positivamente a 2 questões ela deve ser
                            classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
                            Caso contrário, ele será classificado como "Inocente".

                            Use “S” para sim e “N” para não
*/

package aula005

fun main() {
    var soma = 0
    println("Telefonou para a vítima?")
    var resposta = readLine()!!.toLowerCase()
    if(resposta=="s"){
        soma++
    }
    println("Esteve no local do crime?")
    resposta = readLine()!!.toLowerCase()
    if(resposta=="s"){
        soma++
    }
    println("Mora perto da vítima?")
    resposta = readLine()!!.toLowerCase()
    if(resposta=="s"){
        soma++
    }
    println("Devia para a vítima?")
    resposta = readLine()!!.toLowerCase()
    if(resposta=="s"){
        soma++
    }
    println("Já trabalhou com a vítima?")
    resposta = readLine()!!.toLowerCase()
    if(resposta=="s") {
        soma++
    }
    when {
        soma==5 -> {
            println("Assassino")
        }
        soma>=3 -> {
            println("Cúmplice")
        }
        soma==2 -> {
            println("Suspeito")
        }
        else -> {
            println("Inocente")
        }
    }
}