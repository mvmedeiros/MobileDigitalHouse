/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Aula 5: Exercícios Decisão

    Nível 2 - Exercício 2:  Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao
                            usuário a valor do saque e depois informar quantas notas de cada valor serão
                            fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor
                            mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar
                            com a quantidade de notas existentes na máquina.
*/

package aula005

fun main() {
    println("Digite o valor do saque:")
    var valorSaque = readLine()!!.toInt()
    if (valorSaque < 10) {
        println("Saque negado! Valor inferior ao mínimo.")
    } else if(valorSaque > 600) {
        println("Saque negado! Valor excede o máximo permitido.")
    } else {
        var notas = valorSaque  / 100
        if (notas > 0) {
            println("$notas Cédulas de R$100")
        }
        valorSaque = valorSaque - (100 * notas)
        notas = valorSaque / 50
        if (notas > 0) {
            println("$notas Cédulas de R$50")
        }
        valorSaque = valorSaque - (50 * notas)
        notas = valorSaque / 10
        if (notas > 0) {
            println("$notas Cédulas de R$10")
        }
        valorSaque = valorSaque - (10 * notas)
        notas = valorSaque / 5
        if (notas > 0) {
            println("$notas Cédulas de R$5")
        }
        valorSaque = valorSaque - (5 * notas)
        if (valorSaque > 0) {
            println("$valorSaque Cédulas de R$1")
        }
    }
}