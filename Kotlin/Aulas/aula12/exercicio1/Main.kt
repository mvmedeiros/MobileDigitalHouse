package Aulas.aula12.exercicio1

fun main(){
    val loteria = mapOf(0 to "Ovos", 1 to "Água", 2 to "Escopeta", 3 to "Cavalo", 4 to "Dentista", 5 to "Fogo")
    val apelidos = mapOf("João" to listOf("Juan", "Fissura", "Maromba")
            ,"Miguel" to listOf("Night Watch", "Bruce Wayne", "Tampinha")
            ,"Maria" to listOf("Wonder Woman", "Mary", "Marilene")
            ,"Lucas" to listOf("Lukinha", "Jorge", "George"))

    println("Loteria:")
    loteria.forEach{
        println("Número: ${it.key} - Valor: ${it.value}")
    }
    println("\n\n")
    println("Apelidos:")
    apelidos.forEach{
        println("Nome: ${it.key} - Apelidos: ${it.value}")
    }
}
