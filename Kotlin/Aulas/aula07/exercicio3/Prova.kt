package Aulas.aula07.exercicio3

class Prova(val dificuldade: Int, val energiaNecessaria: Int){
    fun podeRealizar(atleta: Atleta) = (atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria)
}