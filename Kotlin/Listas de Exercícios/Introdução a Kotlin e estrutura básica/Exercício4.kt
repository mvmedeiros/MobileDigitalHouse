/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Lista de exercícios: Introdução a Kotlin e estrutura básica

    4) Escrever um programa que imprima na tela os primeiros 100 números inteiros positivos ímpares.
*/

fun main(){
    println("-- O programa imprime 100 os primeiros números positivos ímpares --")

    primeirosImparesPositivos(100)
}

fun primeirosImparesPositivos(quantidade: Int){
    var contador = 0
    var numero = 0
    var separador = ","

    while(numero <= 2*quantidade){
        if(numero % 2 != 0) {
            contador++
            if (contador == quantidade) separador = ".\n"
            print("$numero$separador ")
        }
        numero++
    }
    println("Os primeiros $contador números positivos ímpares foram impressos.")
}
