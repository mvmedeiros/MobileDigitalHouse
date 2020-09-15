/*  Curso Mobile Android Digital House
    Autor: Marcus Medeiros
    Lista de exercícios: Introdução a Kotlin e estrutura básica

    5) Escrever um código que deve analisar quatro números inteiros e, caso numA seja maior que numC e numD
    ou caso numB seja maior que numC e numD, retornar true, caso contrário, retornar false.
*/

fun main(){
    println("-- O programa compara 4 números inteiros. Caso o primeiro ou o segundo sejam maiores que o " +
            "segundo e o terceiro, retorna verdadeiro. --")
    val numeros = ArrayList<Int>()

    for(i in 1..4){
        print("Digite o ${i}º número: ")
        val num = readLine()!!.toInt()
        numeros.add(num)
    }
    println(comparaNumeros(numeros[0], numeros[1], numeros[2], numeros[3]))
}

fun comparaNumeros(numA: Int, numB: Int, numC: Int, numD: Int):Boolean {
    return (numA > numC && numA > numD || numB > numC && numB > numD)
}