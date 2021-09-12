class Aluno (var nome:String, var sobreNome:String , var codigoAluno:Int )  {
  
    override fun equals(other: Any?): Boolean {
        return (other is nome) && (other.codigoAluno == this.nome)
    }




}
