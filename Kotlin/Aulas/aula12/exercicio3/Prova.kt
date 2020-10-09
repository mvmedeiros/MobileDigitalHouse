package Aulas.aula12.exercicio3

class Prova() {
    fun somaTotal(conjuntoInteiros: Set<Int>) {
        var soma = 0
        conjuntoInteiros.forEach {soma += it}
        println(soma)

        //O que poderia ser simplificado:
        println(conjuntoInteiros.sum())
    }
}
