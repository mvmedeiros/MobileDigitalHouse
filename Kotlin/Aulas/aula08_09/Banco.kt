package Aulas.aula08_09

import Aulas.aula07.exercicio1.Conta

class Banco: Imprimivel {
    private val registro = ArrayList<ContaBancaria>()

    fun inserir(contaBancaria: ContaBancaria){
        if(procurarConta(contaBancaria.getConta()) == null){
            if(registro.size != 0)
                contaBancaria.setConta(registro.last().getConta()+1)
            else
                contaBancaria.setConta(1)

            registro.add(contaBancaria)
            println("Conta inserida no registro do banco com sucesso.")
        }
        else{
            println("Número da conta já existe, o registro do banco só aceita contas únicas.")
        }
    }

    fun remover(contaBancaria: ContaBancaria){
        if(procurarConta(contaBancaria.getConta()) != null){
            registro.remove(contaBancaria)
            println("Conta removida do registro do banco com sucesso.")
        }
        else{
            println("Número da conta não existente, o registro do banco só aceita contas únicas.")
        }
    }
    fun procurarConta(numeroBusca: Int): ContaBancaria? = registro.find{it.getConta() == numeroBusca}

    override fun mostrarDados(){
        registro.forEach{contaBancaria -> contaBancaria.mostrarDados()}
    }

    fun executaDeposito(numeroBusca: Int, quantia: Double): Boolean? = procurarConta(numeroBusca)?.depositar(quantia)

    fun executaSaque(numeroBusca: Int, quantia: Double): Boolean? = procurarConta(numeroBusca)?.sacar(quantia)

    fun executaTransferencia(numeroOrigem: Int, numeroDestino: Int, quantia: Double){
        val contaOrigem: ContaBancaria? = procurarConta(numeroOrigem)
        val contaDestino: ContaBancaria? = procurarConta(numeroDestino)
        contaDestino?.let { contaOrigem?.transferir(it, quantia) }
    }

    fun executaRelatorio(numeroBusca: Int) = procurarConta(numeroBusca)?.mostrarDados()
}