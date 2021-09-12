fun main() {
    var alunoNovo = Aluno("cris", "Valeriano", 111)
    var alunoNovo2 = Aluno("Nicolas", "Reis", 112)
    var cursoCanto = Curso("Canto", 1)
    var cursoViolao = Curso("Violao", 2)
    var professorTitular1 = ProfessorTitular("Christiane", "Valeriano", 2, 10, "Popular")
    var professorTitular2 = ProfessorTitular("Nicole", "Alencar", 4, 11, "Lirico")
    var professorAdjunto1 = ProfessorAdjunto("Eliana", "Valeriano", 5, 4, 5)
    var professorAdjunto2 = ProfessorAdjunto("Nathalie", "Silva", 1, 5, 6)
    var listaAlunos1= mutableListOf<Aluno>()
    listaAlunos1.add(alunoNovo)
    listaAlunos1.add(alunoNovo2)
    listaAlunos1.forEach(){ println(it.nomeAluno)}
    var cursoPiano = Curso("Piano",14,professorTitular1,professorAdjunto1,15,listaAlunos1)

}