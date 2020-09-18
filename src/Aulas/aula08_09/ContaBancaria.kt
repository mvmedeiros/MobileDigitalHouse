package Aulas.aula08_09

import Aulas.aula07.exercicio1.Conta

abstract class ContaBancaria: Imprimivel {

    protected var numeroConta: Int = 0
    protected var saldo: Double = 0.0

    abstract fun sacar(quantia: Double):Boolean
    abstract fun depositar(quantia: Double):Boolean
    fun getConta(): Int = numeroConta
    fun setConta(novoNumero: Int){numeroConta = novoNumero}

    fun transferir(contaDestino: ContaBancaria,quantia: Double) {
        val saldoOrigem: Double = saldo
        if(sacar(quantia)) {
            if (!contaDestino.depositar(quantia))
                saldo = saldoOrigem
        }
        else println("Operação inválida: Saldo insuficiente para transferência.")
    }

    override fun mostrarDados(){
        println("Número da conta: $numeroConta.")
        println("Saldo em conta: R$ $saldo.")
    }
}