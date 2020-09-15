/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Aula 5: Exercícios Repetição

    Nível 2 - Exercício 3:  Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer
                            número inteiro entre 1 a 10. O usuário deve informar de qual número ele deseja ver
                            a tabuada. A saída deve ser conforme o exemplo abaixo:
*/

package Aulas.aula05.Repetição

fun main(){
    println("--- O programa retorna a tabuada desejada entre 1 e 10 ---")
    var base: Int = 0
    do {
        println("Informe qual tabuada deseja (entre 1 e 10): ")
        base = readLine()!!.toInt()
        if(base < 1 || base > 10)
            println("Valor inválido.")
        else
            break
    }while(true)

    print("Tabuada de $base: ")
    for(i in 1..10) {
        println("$i x $base = ${i*base}")
    }
}