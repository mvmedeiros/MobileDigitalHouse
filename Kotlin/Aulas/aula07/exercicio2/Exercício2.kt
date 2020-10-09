package Aulas.aula07.exercicio2

fun main(){
    val jogador1 = JogadorDeFutebol("Bentinho")
    val jogador2 = JogadorDeFutebol("Tião")
    val treinoLeve = SessaoDeTreinamento(100)
    val treinoPesado = SessaoDeTreinamento(500)

    treinoLeve.treinarA(jogador1)
    treinoPesado.treinarA(jogador2)
}