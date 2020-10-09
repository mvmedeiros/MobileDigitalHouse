package Aulas.aula07.exercicio1

fun main(){
    val conta1 = Conta(1,Cliente("José","Alberto"))
    val conta2 = Conta(2,Cliente("João","Roberto"))

    conta1.depositar(3000.5)
    conta1.sacar(578.8)
    conta2.depositar(7855.7)
    conta2.sacar(10000.0)
}