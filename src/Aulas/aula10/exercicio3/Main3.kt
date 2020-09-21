package Aulas.aula10.exercicio3

fun main(){
    val estoque1 = Estoque("Arroz",150,300)

    //Mudança de nome
    println()
    println("--- Mudança de nome ---")
    println(estoque1.mostra())
    estoque1.mudarNome("Feijão")
    println(estoque1.mostra())

    //Mudança de quantidade mínima
    println()
    println("--- Mudança de quantidade mínima ---")
    println(estoque1.mostra())
    estoque1.mudarQtdMinima(45)
    println(estoque1.mostra())

    //Mudança de quantidade atual
    println()
    println("--- Mudança de quantidade atual ---")
    println(estoque1.mostra())
    estoque1.mudarQtdAtual(70)
    println(estoque1.mostra())

    //Reposição
    println()
    println("--- Reposição ---")
    println(estoque1.mostra())
    estoque1.repor(500)
    println(estoque1.mostra())

    //Baixa
    println()
    println("--- Baixa ---")
    println(estoque1.mostra())
    estoque1.darBaixa(250)
    println(estoque1.mostra())

    //Necessidade de reposição
    println()
    println("--- Necessidade de reposição ---")
    println(estoque1.precisaRepor())

}