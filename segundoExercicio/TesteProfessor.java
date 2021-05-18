package segundoExercicio;

public class TesteProfessor {
    public static void main(String[] args)
    {
        ProfessorConcursado profconcursado = new ProfessorConcursado();
        
        ProfessorHorista profhorista = new ProfessorHorista();
        profconcursado.setMatricula(2020);
        profconcursado.setNome("João");
        profconcursado.setSalario(2000);
        profhorista.setMatricula(2021);
        profhorista.setNome("Maria");
        profhorista.setValorHora(100);
        profhorista.setNumeroHoras(15);
        profhorista.getSalario();
        
        System.out.println("Salario Professor Concursado = R$"+profconcursado.getSalario());
        System.out.println("Matricula Professor Concursado = Nº"+profconcursado.getMatricula());
        System.out.println("Salario Professor Horista = R$"+profhorista.getSalario());
        System.out.println("Matricula Professor Horista = Nº"+profhorista.getMatricula());
}
}