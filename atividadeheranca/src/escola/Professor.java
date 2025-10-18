public class Professor extends Funcionario {
    
  private int data;

  public Professor(String nome, int idade, long cpf, int data){
    super(nome, idade, cpf);
    this.data = data;

  }
  @Override
  public void trabalhando(){
    System.out.println("Professor esta dando aula");
  }
  public void aula(){
    System.out.printlm("Profesor esta dando aula de Matematica");

  }

}
