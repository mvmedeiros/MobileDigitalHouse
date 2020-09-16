package Aulas.aula07.exercicio4

fun main(){
    var toro = Carros(7.2)
    toro.adicionarGasolina(50.7)
    toro.andar(5.3)
    println("O volume do tanque é de ${"%.2f".format(toro.obterGasolina())} Litros.")
}