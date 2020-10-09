package Aulas.aula11.exercicio3

fun main(){
    val listaDeAlunos = ArrayList<Aluno>()
    listaDeAlunos.add(Aluno("José",1))
    listaDeAlunos.add(Aluno("Carlos",2))
    listaDeAlunos.add(Aluno("Maria",3))
    listaDeAlunos.add(Aluno("Marieta",4))

    val alunoDeFora = Aluno("Zé",2)
    println(listaDeAlunos.contains(alunoDeFora))
}