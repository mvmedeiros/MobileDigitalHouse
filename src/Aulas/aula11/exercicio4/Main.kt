package Aulas.aula11.exercicio4

fun main(){
    val listaDeFuncionarios = ArrayList<Funcionario>()
    listaDeFuncionarios.add(Funcionario("José",123))
    listaDeFuncionarios.add(Funcionario("João",125))
    listaDeFuncionarios.add(Funcionario("Maria",145))
    listaDeFuncionarios.add(Funcionario("Das Dores",678))

    println(listaDeFuncionarios.contains(Funcionario("Beltrano",123)))
}