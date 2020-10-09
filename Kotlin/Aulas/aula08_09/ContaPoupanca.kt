package Aulas.aula08_09

class ContaPoupanca: ContaBancaria() {
    private var limite: Double = 1000.0
    var limiteParcial: Double

    init{limiteParcial = limite}

    override fun sacar(quantia: Double):Boolean{
        if(quantia <= (saldo + limiteParcial)){
            saldo -= quantia
            if(saldo < 0) limiteParcial = limite + saldo
            return true
        }
        else{
            println("Saldo insuficiente.")
            return false
        }
    }

    override fun depositar(quantia: Double):Boolean{
        if(saldo < 0){
            limiteParcial -= saldo
        }else limiteParcial = limite
        saldo += quantia
        return true
    }

    override fun mostrarDados(){
        super.mostrarDados()
        println("Limite restante: R$ $limiteParcial.")
        println()
    }
}