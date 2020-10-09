package Aulas.aula08_09

class ContaCorrente: ContaBancaria() {
    private var taxaDeOperacao: Double = 2.5

    override fun sacar(quantia: Double): Boolean{
        if((quantia + taxaDeOperacao) <= saldo){
            saldo -= (quantia + taxaDeOperacao)
            return true
        }
        else{
            println("Saldo insuficiente para saque.")
            return false
        }
    }

    override fun depositar(quantia: Double): Boolean{
        if((quantia) >= taxaDeOperacao){
            saldo += (quantia - taxaDeOperacao)
            return true
        }
        else{
            println("Valor de depósito mínimo é de R$ $taxaDeOperacao.")
            return false
        }
    }

    override fun mostrarDados(){
        super.mostrarDados()
        println("Taxa de operação: R$ $taxaDeOperacao.")
        println()
    }
}