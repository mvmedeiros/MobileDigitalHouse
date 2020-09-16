package Aulas.aula07.exercicio5

class Cliente(val nome: String, val sobrenome: String, val contato: String) {
    var nomeCompleto: String
    init{nomeCompleto = nome + " " + sobrenome}
}