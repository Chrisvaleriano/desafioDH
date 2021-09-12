class Aluno (var nomeAluno:String, var sobreNome:String , var codigoAluno:Int )  {
    override fun equals(other: Any?): Boolean {
        return (other is Aluno) && (other.codigoAluno == this.codigoAluno)
    }
    override fun hashCode(): Int {
        return codigoAluno
    }
    }