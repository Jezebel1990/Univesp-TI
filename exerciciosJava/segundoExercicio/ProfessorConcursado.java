package segundoExercicio;

public class ProfessorConcursado extends Professor {
    
 private float salario;
 public ProfessorConcursado()
 {
}
public ProfessorConcursado(int matricula,String nome)
{
    super(matricula,nome);
}
public ProfessorConcursado(int matricula,String nome,float salario)
{
super(matricula,nome);
this.salario = salario;
}
public float getSalario()
{
    return salario;
}
public void setSalario(float salario)
{
    this.salario = salario;
 }
}
