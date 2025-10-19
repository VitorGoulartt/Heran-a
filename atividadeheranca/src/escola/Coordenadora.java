package escola;

public class Coordenadora extends Funcionario {
     private String advertencia;

     public Coordenadora(String nome, int idade, int salario, String advertencia){
        super(nome, idade, salario);
        this.advertencia = advertencia;

     }
     @Override
     public void Fazer(){
        System.out.println("Diretora esta trabalhando");
     }
     public void Suspensao(){

        System.out.println("Diretora esta supervisionando os aluno que levaram " + this.advertencia);


     }
}
