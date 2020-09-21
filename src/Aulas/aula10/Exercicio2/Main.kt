package Aulas.aula10.Exercicio2

fun main(){
    val fatura = Fatura()
    val item1 = Item(1,"item 1",10,5.0)

    fatura.itens.add(item1)
    fatura.itens.add(item1)
    println(fatura.getTotalFatura())
}