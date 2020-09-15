/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Aula 6: Exercícios Lista

    Nível 2 - Exercício 2:  Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao
                            usuário a valor do saque e depois informar quantas notas de cada valor serão
                            fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor
                            mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar
                            com a quantidade de notas existentes na máquina.
*/

package Aulas.aula06.Lista

fun main() {
    println("Informe o valor do saque: ")
    var valorSaque = readLine()!!.toInt()
    val notas = arrayOf(100,50,10,5,1)

    if (valorSaque < 10 || valorSaque > 600) {
        print("Valor de saque inválido.")
    } else {
        for (i in notas.indices) {
            val quantidadeNotas = valorSaque / notas[i]
            valorSaque -= quantidadeNotas * notas[i]
            if (quantidadeNotas != 0) {
                println("$quantidadeNotas notas de ${notas[i]}")
            }
        }
    }
}