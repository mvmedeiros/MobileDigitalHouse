package Aulas.aula07.exercicio5

class Concessionaria() {
    val registrosVenda = ArrayList<Venda>()

    fun registrarVenda(venda: Venda){
        registrosVenda.add(venda)
        println("Venda registrada:")
        println("Cliente: ${venda.cliente.nomeCompleto}.")
        println("Veículo: ${venda.veiculo.modelo}, ${venda.veiculo.anoFabricacao}, " +
                "${venda.veiculo.cor}, ${venda.veiculo.quilometragem} km(s).")
        println("Valor: R$ ${"%.2f".format(venda.valorVenda)}.")
        println()
    }

    fun exibirRegistro(){
        println("Exibindo registro de vendas:")
        registrosVenda.forEachIndexed{index, element ->
            println("Registro ${index+1}:")
            println("Cliente: ${element.cliente.nomeCompleto}")
            println("Veículo: ${element.veiculo.modelo}, ${element.veiculo.anoFabricacao}, " +
                    "${element.veiculo.cor}, ${element.veiculo.quilometragem} km(s).")
            println("Valor: R$ ${"%.2f".format(element.valorVenda)}.")
            println()
        }
    }
}
