class Aluno (var nome:String, var sobreNome:String , var codigoAluno:Int )  {

    override fun equals(other: Any?): Boolean {
        return (other is Aluno && this.codigoAluno == other.codigoAluno)
    }
}