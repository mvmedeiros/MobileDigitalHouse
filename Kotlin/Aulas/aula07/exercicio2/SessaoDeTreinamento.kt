package Aulas.aula07.exercicio2

class SessaoDeTreinamento(val experiencia: Int) {
    fun treinarA(jogador: JogadorDeFutebol){
        val expPrevia: Int
        println("- INICIANDO TREINAMENTO - ")
        println("Jogador: ${jogador.nome}")
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()

        expPrevia = jogador.experiencia
        jogador.experiencia += experiencia
        println("Evolução de experiência: $expPrevia -> ${jogador.experiencia}")
    }
}