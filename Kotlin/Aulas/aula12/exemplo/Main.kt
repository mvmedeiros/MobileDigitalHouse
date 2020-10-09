package Aulas.aula12.exemplo

fun main(){
    val pessoa1 = Pessoa("Ana",Estado("PB","Paraíba"))
    val pessoa2 = Pessoa("Bento",Estado("AL","Alagoas"))
    val pessoa3 = Pessoa("Carlos",Estado("PB","Paraíba"))
    val pessoa4 = Pessoa("Dara",Estado("PB","Paraíba"))
    val pessoa5 = Pessoa("Esmeralda",Estado("SP","São Paulo"))
    val pessoa6 = Pessoa("José",Estado("RN","Rio Grande do Norte"))
    val pessoa7 = Pessoa("João",Estado("RN","Rio Grande do Norte"))

    val pessoas = listOf(pessoa1, pessoa2,pessoa3,pessoa4,pessoa5,pessoa6,pessoa7)
    println(pessoas.groupBy{it.estado.nome})
}