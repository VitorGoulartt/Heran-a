package escola;

public class Professor extends Funcionario {
    
  private String materia;

  public Professor(String nome, int idade, int salario, String materia){
    super(nome, idade, salario);
    this.materia = materia;

  }
  @Override
  public void Fazer(){
    System.out.println("Professor esta ensinando algebra");
  }
  public void aula(){
    System.out.println("Profesor esta dando aula de " + this.materia);

  }

}
