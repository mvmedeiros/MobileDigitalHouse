class DigitalHouseManager {
    val listaDeCursos = mutableListOf<Curso>()
    val listaDeMatriculas = mutableListOf<Matricula>()
    val listaDeAlunos = mutableListOf<Aluno>()
    val listaDeProfessores = mutableListOf<Professor>()

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int){
        listaDeCursos.add(Curso(nome,codigoCurso,quantidadeMaximaDeAlunos))
    }

    fun excluirCurso(codigoCurso: Int){
        val cursoBuscado: Curso? = listaDeCursos.find{it.codigo == codigoCurso}
        listaDeCursos.remove(cursoBuscado)
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int){
        listaDeProfessores.add(ProfessorAdjunto(quantidadeDeHoras,nome, sobrenome,codigoProfessor,0))
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String , codigoProfessor: Int, especialidade: String){
        listaDeProfessores.add(ProfessorTitular(especialidade,nome, sobrenome,codigoProfessor,0))
    }

    fun excluirProfessor(codigoProfessor: Int){
        val professorBuscado: Professor? = listaDeProfessores.find{it.codigo == codigoProfessor}
        listaDeProfessores.remove(professorBuscado)
    }

    fun matricularAluno(nome: String , sobrenome: String , codigoAluno: Int){
        listaDeAlunos.add(Aluno(nome,sobrenome,codigoAluno))
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){
        val cursoBuscado: Curso? = listaDeCursos.find{it.codigo == codigoCurso}
        val alunoBuscado: Aluno? = listaDeAlunos.find{it.codigo == codigoAluno}

        if(cursoBuscado != null && alunoBuscado != null) {
            if (cursoBuscado.listaDeAlunos.size < cursoBuscado.maximoDeAlunos){
                listaDeMatriculas.add(Matricula(alunoBuscado, cursoBuscado))
                println("Aluno ${alunoBuscado.nome} ${alunoBuscado.sobrenome} foi matriculado no curso ${cursoBuscado.nome}.")
            }else
                throw Exception("Não há vagas disponíveis no curso ${cursoBuscado.nome}.")
        }else
            throw Exception("Curso e/ou aluno não encontrado(s).")
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){
        val titularBuscado: Professor? = listaDeProfessores.find{it.codigo == codigoProfessorTitular}
        val adjuntoBuscado: Professor? = listaDeProfessores.find{it.codigo == codigoProfessorAdjunto}
        val cursoBuscado: Curso? = listaDeCursos.find{it.codigo == codigoCurso}

        if(cursoBuscado != null) {
            if(titularBuscado != null) cursoBuscado.professorTitular = titularBuscado as ProfessorTitular?
            if(adjuntoBuscado != null) cursoBuscado.professorAdjunto = adjuntoBuscado as ProfessorAdjunto?
        }
    }
}