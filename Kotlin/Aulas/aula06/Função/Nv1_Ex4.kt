/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Aula 6: Exercícios Funções

    Nível 1 - Exercício 4: Jogo de Craps. Faça um programa de implemente um jogo de Craps. O jogador
                           lança um par de dados, obtendo um valor entre 2 e 12. Se, na primeira jogada, você
                           tirar 7 ou 11, você um "natural" e ganhou. Se você tirar 2, 3 ou 12 na primeira
                           jogada, isto é chamado de "craps" e você perdeu. Se, na primeira jogada, você fez
                           um 4, 5, 6, 8, 9 ou 10,este é seu "Ponto". Seu objetivo agora é continuar jogando os
                           dados até tirar este número novamente. Você perde, no entanto, se tirar um 7 antes
                           de tirar este Ponto novamente.
*/

package Aulas.aula06.Função
import kotlin.random.Random

fun main() {
    var valorMeta = -1
    var fimJogo = false

    var valor = rolarDados()
    when (valor) {
        7, 11 -> {
            println("Natural! Você ganhou :D")
            fimJogo = true
        }
        2, 3, 12 -> {
            println("Craps! Você perdeu :(")
            fimJogo = true
        }
        else -> {
            valorMeta = valor
            println("Sua meta é tirar o valor $valorMeta")
        }
    }

    do {
        if (fimJogo) {
            break
        }

        println()

        valor = rolarDados()

        if (valor == 7) {
            println("Você perdeu :(")
            fimJogo = true
        } else if (valor == valorMeta) {
            println("Você ganhou \\o/")
            fimJogo = true
        }
    } while (true)
}

fun rolarDados(): Int {
    print("ENTER para rolar os dados.")
    readLine()
    val valor = Random.nextInt(2, 12)
    println("Soma dos dados: $valor")
    return valor
}