/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Lista de exercícios: Introdução a Kotlin e estrutura básica

    1) Escrever o código que deve analisar três números inteiros e retornar o maior deles.
*/

fun main(){
    println("-- O programa compara 3 números inteiros e retorna o maior dentre eles --")
    println("Informe o primeiro número inteiro: ")
    val numero1 = readLine()!!.toInt()

    println("Informe o segundo número inteiro: ")
    val numero2 = readLine()!!.toInt()

    println("Informe o terceiro número inteiro: ")
    val numero3 = readLine()!!.toInt()

    var maiorNumero: Int
    if(numero1 >  numero2){
        maiorNumero = numero1
    }else maiorNumero = numero2
    if(numero3 > maiorNumero)
        maiorNumero = numero3

    println("O maior número é $maiorNumero.")
}
