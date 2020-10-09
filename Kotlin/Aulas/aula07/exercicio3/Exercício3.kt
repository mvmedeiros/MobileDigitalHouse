package Aulas.aula07.exercicio3

fun main(){
    val atleta1 = Atleta("Flash",8,100)
    val atleta2 = Atleta("Zoom",6,70)

    val prova1Atleta1 = Prova(6, 80)
    val prova2Atleta1 = Prova(10, 80)
    val prova3Atleta1 = Prova(4, 130)

    println("--- Preparatório para provas do ${atleta1.nome} ---")
    println("Aptidão para Prova 1: ${prova1Atleta1.podeRealizar(atleta1)}")
    println("Aptidão para Prova 2: ${prova2Atleta1.podeRealizar(atleta1)}")
    println("Aptidão para Prova 3: ${prova3Atleta1.podeRealizar(atleta1)}")

    val prova1Atleta2 = Prova(15, 50)
    val prova2Atleta2 = Prova(1, 8)
    val prova3Atleta2 = Prova(5, 160)
    println("")
    println("--- Preparatório para provas do ${atleta2.nome} ---")
    println("Aptidão para Prova 1: ${prova1Atleta2.podeRealizar(atleta2)}")
    println("Aptidão para Prova 2: ${prova2Atleta2.podeRealizar(atleta2)}")
    println("Aptidão para Prova 3: ${prova3Atleta2.podeRealizar(atleta2)}")
}
