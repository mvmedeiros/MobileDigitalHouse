package Aulas.aula08_09

import kotlin.Int as Int

fun main(){

    val muquirana = Banco()

    //Menu do banco
    menuPrincipal(muquirana)
}

fun menuPrincipal(banco: Banco){
    var onMenuPrincipal = true
    var opcao: Int

    do{
        println(">>>> BANCO MUQUIRANA <<<<\n")
        println("- Operações disponíveis -")
        println("1. Criar conta.")
        println("2. Selecionar conta.")
        println("3. Remover conta.")
        println("4. Gerar relatório de contas.")
        println("5. Finalizar.\n")
        println("Informe a opção desejada: ")
        opcao = readLine()!!.toInt()
        if(opcao in 1..5)
            onMenuPrincipal = false

    }while(onMenuPrincipal)

    when(opcao) {
        1 -> criarConta(banco)
        2 -> {
            println("Informe o número da conta que deseja selecionar: ")
            val numeroBusca = readLine()!!.toInt()
            selecionarConta(banco, numeroBusca)
        }
        3 -> {
            println("Informe o número da conta que deseja remover: ")
            val numeroBusca = readLine()!!.toInt()
            removerConta(banco, numeroBusca)
        }
        4 -> listarContas(banco)
        5 -> println("> SAINDO DA APLICAÇÃO <")
        else -> println("Erro de opção principal.")
    }
}

fun criarConta(banco: Banco){
    var onPrimeiraOpcao = true
    var opcao: Int
    do{
        println("Informe o tipo de conta desejado: ")
        println("1. Conta corrente.")
        println("2. Conta poupança.")
        opcao = readLine()!!.toInt()
        if(opcao in 1..2)
            onPrimeiraOpcao = false

    }while(onPrimeiraOpcao)

    when(opcao) {
        1 -> banco.inserir(ContaCorrente())
        2 -> banco.inserir(ContaPoupanca())
        else -> println("Erro de opção de conta.")
    }

    menuPrincipal(banco)
}

fun selecionarConta(banco: Banco, numeroBusca: Int){
    var onMenuSelecionarConta = true
    var opcao: String

    do{
        println()
        println("- Operações disponíveis -")
        println("a. Depositar.")
        println("b. Sacar.")
        println("c. Transferir.")
        println("d. Gerar relatório.")
        println("e. Retornar ao menu principal.\n")
        println("Informe a opção desejada: ")
        opcao = readLine()!!.toLowerCase()
        when(opcao){
            "a" -> {
                println("Informe o valor que deseja depositar:")
                val quantia:Double = readLine()!!.toDouble()
                banco.executaDeposito(numeroBusca, quantia)
            }
           "b" -> {
               println("Informe o valor que deseja sacar:")
               val quantia:Double = readLine()!!.toDouble()
               banco.executaSaque(numeroBusca, quantia)
            }
            "c" -> {
                println("Informe o número da conta destino:")
                val destino: Int = readLine()!!.toInt()
                println("Informe o valor que deseja transferir:")
                val quantia:Double = readLine()!!.toDouble()
                banco.executaTransferencia(numeroBusca, destino, quantia)
            }
            "d" -> {
                println("Relatório da conta:")
                banco.executaRelatorio(numeroBusca)
            }
            "e" -> {
                println("Retornando ao menu principal.")
                onMenuSelecionarConta = false
            }
            else -> println("Opção inválida.")
        }

    }while(onMenuSelecionarConta)
    menuPrincipal(banco)
}

fun removerConta(banco: Banco, numeroBusca: Int){
    val conta: ContaBancaria? = banco.procurarConta(numeroBusca)
    if (conta != null) {
        banco.remover(conta)
    }
    menuPrincipal(banco)
}

fun listarContas(banco: Banco){
    banco.mostrarDados()
    menuPrincipal(banco)
}