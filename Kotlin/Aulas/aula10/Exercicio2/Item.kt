package Aulas.aula10.Exercicio2

import kotlin.math.max

class Item(val numeroItem:Int, val descricao: String, var quantidade: Int, var preco: Double){

    init{
        if(quantidade < 0) quantidade = 0
        preco = max(0.0, preco)
    }
}