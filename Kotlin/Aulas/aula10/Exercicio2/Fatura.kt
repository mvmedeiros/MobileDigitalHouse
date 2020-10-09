package Aulas.aula10.Exercicio2

class Fatura() {
    val itens = ArrayList<Item>()

    fun getTotalFatura(): Double {
        var total = 0.0
        itens.forEach{total += (it.preco * it.quantidade.toDouble())}
        return total
    }
}