package Aulas.aula10.exercicio3

class Estoque(var nome:String, var qtdAtual:Int, var qtdMinima:Int) {

    fun mudarNome(novoNome:String){nome = novoNome}
    fun mudarQtdMinima(novaQtd:Int){qtdMinima = novaQtd}
    fun mudarQtdAtual(novaQtd:Int){qtdAtual = novaQtd}
    fun repor(quantidade:Int){qtdAtual += quantidade}
    fun darBaixa(quantidade:Int){
        if(qtdAtual - quantidade >= 0) qtdAtual -= quantidade
    }
    fun mostra():String = "Nome do produto: $nome. Quantidade mínima: $qtdMinima. Quantidade atual: $qtdAtual."
    fun precisaRepor() = qtdAtual <= qtdMinima
}