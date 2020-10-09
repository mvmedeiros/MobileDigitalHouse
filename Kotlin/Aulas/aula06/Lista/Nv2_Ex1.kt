/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Aula 6: Exercícios Lista

    Nível 2 - Exercício 1:  Uma empresa de pesquisas precisa tabular os resultados da seguinte enquete
                            feita a um grande quantidade de organizações:
                            "Qual o melhor Sistema Operacional para uso em servidores?"
                            As possíveis respostas são:
                            1- Windows Server
                            2- Unix
                            3- Linux
                            4- Netware
                            5- Mac OS
                            6- Outro
                            Você foi contratado para desenvolver um programa que leia o resultado da enquete
                            e informe ao final o resultado da mesma. O programa deverá ler os valores até ser
                            informado o valor 0, que encerra a entrada dos dados. Não deverão ser aceitos
                            valores além dos válidos para o programa (0 a 6). Os valores referentes a cada uma
                            das opções devem ser armazenados num vetor. Após os dados terem sido
                            completamente informados, o programa deverá calcular a percentual de cada um
                            dos concorrentes e informar o vencedor da enquete. O formato da saída foi dado
                            pela empresa, e é o seguinte:
                            Sistema Operacional Votos %
                            ------------------- ----- ---
                            Windows Server 1500 17%
                            Unix 3500 40%
                            Linux 3000 34%
                            Netware 500 5%
                            Mac OS 150 2%
                            Outro 150 2%
                            ------------------- -----
                            Total 8800
                            O Sistema Operacional mais votado foi o Unix, com 3500 votos,
                            correspondendo a 40% dos votos.
*/

package Aulas.aula06.Lista

fun main() {
    val votos = arrayOf(0, 0, 0, 0, 0, 0)
    val sistemasOperacionais = arrayOf("Window Server", "Unix         ", "Linux        ",
            "Netware      ", "Mac OS       ", "Outro        ")
    var totalVotos = 0
    var numeroVotoMaisVotado = -1
    var indiceMaisVotado = -1

    println("Qual o melhor Sistema Operacional para uso em servidores?")
    println("As possíveis respostas são:")
    println("1 - Window Server")
    println("2 - Unix")
    println("3 - Linux")
    println("4 - Netware")
    println("5 - Mac OS")
    println("6 - Outro")
    println("0 - Exit")

    do {
        print("Digite seu voto: ")
        val vote = readLine()!!.toInt()
        if (vote == 0) {
            break
        } else if (vote > 6 || vote < 0) {
            println("Valor inválido! ")
            continue
        }
        totalVotos++
        votos[vote - 1]++
    } while (true)

    println()
    println("Sistema Operacional\tVotos\t%")
    println("-------------------\t-----\t---")
    for (i in sistemasOperacionais.indices) {
        var percentual = (votos[i] * 100.0) / totalVotos
        if (percentual.equals(Double.NaN)) percentual = 0.0
        println("${sistemasOperacionais[i]}\t\t${votos[i]}\t\t${"%.2f".format(percentual)}")

        if (votos[i] > numeroVotoMaisVotado) {
            numeroVotoMaisVotado = votos[i]
            indiceMaisVotado = i
        }
    }

    if (totalVotos > 0) {
        var percentual = (numeroVotoMaisVotado * 100.0) / totalVotos
        if (percentual.equals(Double.NaN)) percentual = 0.0
        println("O Sistema Operacional mais votado foi o ${sistemasOperacionais[indiceMaisVotado]}, " +
                "com $numeroVotoMaisVotado votos, " +
                "correspondendo a ${"%.2f".format(percentual)}% dos votos.")
    } else {
        println("Ninguém participou da pesquisa! :(")
    }
}