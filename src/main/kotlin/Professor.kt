open abstract class Professor(var nome: String, var sobreNome: String, var tempoDeCasa: Int,
                var codigoProfessor: Int) {

    override fun equals(other: Any?): Boolean {
        return (other is Professor && this.codigoProfessor == other.codigoProfessor)
    }
    override fun hashCode(): Int {
        return codigoProfessor
    }
}