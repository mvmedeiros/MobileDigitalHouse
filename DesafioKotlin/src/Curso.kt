class Curso(val nome: String,
            val codigo: Int,
            val maximoDeAlunos: Int) {

    val listaDeAlunos = mutableListOf<Aluno>()
    var professorTitular: ProfessorTitular? = null
    var professorAdjunto: ProfessorAdjunto? = null

    fun adicionarUmAluno(umAluno: Aluno): Boolean{
        if(listaDeAlunos.size < maximoDeAlunos){
            listaDeAlunos.add(umAluno)
            return true
        }else
            return false
    }

    fun excluirAluno(umAluno: Aluno){
        listaDeAlunos.remove(umAluno)
    }
}