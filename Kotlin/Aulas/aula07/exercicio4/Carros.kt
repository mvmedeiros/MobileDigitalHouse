package Aulas.aula07.exercicio4

class Carros(val consumo: Double) {
    var nivelCombustivel: Double = 0.0

    fun andar(kmPercorridos: Double){
        nivelCombustivel -= (consumo * kmPercorridos)
    }

    fun obterGasolina():Double = nivelCombustivel

    fun adicionarGasolina(volume: Double){
        nivelCombustivel += volume
    }
}