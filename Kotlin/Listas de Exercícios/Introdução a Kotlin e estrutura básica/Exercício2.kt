/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Lista de exercícios: Introdução a Kotlin e estrutura básica

    2) Escrever o código que deve analisar duas cadeias de texto e, caso sejam diferentes,
    retornar true, ou, caso sejam iguais, retornar false.

*/

fun main(){
    println("-- O programa compara 2 textos --")
    println("Informe o primeiro texto: ")
    val texto1 = readLine()!!

    println("Informe o segundo texto: ")
    val texto2 = readLine()!!

    if(!!comparaTextos(texto1, texto2))
        println("Os textos são diferentes!")
    else
        println("os textos são iguais!")

}

fun comparaTextos(texto1: String, texto2: String):Boolean {return texto1 != texto2}
