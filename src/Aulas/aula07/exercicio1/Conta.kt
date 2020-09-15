package Aulas.aula07.exercicio1

class Conta(val numeroConta: Int, val titular: Cliente) {
    var saldo: Double = 0.0

    fun depositar(valorDeposito: Double){
        saldo += valorDeposito
        println("Função de Depósito - Titular da conta: ${titular.nome} ${titular.sobrenome}")
        println("Depósito de R$ $valorDeposito. O saldo total da conta é de R$ ${saldo}")
    }

    fun sacar(valorSaque: Double){
        println("Função de Saque - Titular da conta: ${titular.nome} ${titular.sobrenome}")
        if(saldo >= valorSaque){
            saldo -= valorSaque
            println("Saque de R$ $valorSaque. O saldo total da conta é de R$ ${saldo}")
        }else
            println("Função de saque indisponível: saldo insuficiente para saque de R$ $valorSaque.")
    }
}