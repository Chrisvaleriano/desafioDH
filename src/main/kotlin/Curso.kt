class Curso(var nome: String, var codigoCurso: Int) {

    constructor(nome: String, codigoCurso: Int,
        professorTitular: ProfessorTitular, professorAdjunto: ProfessorAdjunto,
        quantMaxAlunos: Int, listaAlunosMatriculados: MutableList<Aluno>
    ) : this(nome, codigoCurso)

}



