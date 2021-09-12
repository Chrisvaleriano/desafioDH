class Curso(var nomeCurso: String , var codigoCurso: Int) {

    constructor(nomeCurso: String, codigoCurso: Int,
        professorTitular: ProfessorTitular, professorAdjunto: ProfessorAdjunto,
        quantMaxAlunos: Int, listaAlunosMatriculados: MutableList<Aluno>
    ) : this(nomeCurso, codigoCurso)

    override fun equals(other: Any?): Boolean {
        return (other is Curso && this.codigoCurso == other.codigoCurso)
    }
    override fun hashCode(): Int {
        return codigoCurso
    }
    }



