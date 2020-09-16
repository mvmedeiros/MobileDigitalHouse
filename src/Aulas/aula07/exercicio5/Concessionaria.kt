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
        registrosVenda.forEach{
            println("Registro:")
            println("Cliente: ${it.cliente.nomeCompleto}")
            println("Veículo: ${it.veiculo.modelo}, ${it.veiculo.anoFabricacao}, " +
                    "${it.veiculo.cor}, ${it.veiculo.quilometragem} km(s).")
            println("Valor: R$ ${"%.2f".format(it.valorVenda)}.")
            println()
        }
    }
}
