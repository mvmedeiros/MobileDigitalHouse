//Importação de bibliotecas
import kotlin.math.floor

fun main(){
    media()
    remuneracao()
    calcularPeso()
    multaPesca()
}

fun media(){
    println("Exercício 1: ")
    println("Digite a nota 1: ")
    val nota1 = readLine()!!.toDouble()
    println("Digite a nota 2: ")
    val nota2 = readLine()!!.toDouble()
    println("Digite a nota 3: ")
    val nota3 = readLine()!!.toDouble()
    println("Digite a nota 4: ")
    val nota4 = readLine()!!.toDouble()

    println()
    println("A média é ${(nota1 + nota2 + nota3 + nota4)/4}")
}

fun remuneracao(){
    println("Exercício 2: ")
    println("Quanto vale sua hora? ")
    val precoHora = readLine()!!.toDouble()
    println("Quantas horas você trabalhou? ")
    val horas = readLine()!!.toDouble()

    println("\nVocê receberá ${precoHora*horas}")
}

fun calcularPeso() {
    println("Exercício 3: ")
    println("Digite a altura: ")
    val altura = readLine()!!.toDouble()

    println("Para homens: ${(72.7*altura) - 58}")
    println("Para mulheres: ${(62.1*altura) - 44.7}")
}

fun multaPesca(){
    println("Exercício 4: ")
    println("Digite o peso dos peixes: ")
    val peso = readLine()!!.toDouble()

    val pesoExcedente: Double = peso - 50
    var multa = 0.0

    if(pesoExcedente > 0.0){
        multa = (4 * (floor(pesoExcedente) + (pesoExcedente - floor(pesoExcedente))))
        println("Excedeu $pesoExcedente Kg.")
    }else{
        println("Não houve excedente.")
    }

    println("O valor a ser pago é de R$ $multa.")
}