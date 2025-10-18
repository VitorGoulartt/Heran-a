public class DIretora extends Funcionario {
     private String advertencia;

     public DIretora(String nome, int idade, long cpf, String advertencia){
        super(nome, idade, cpf);
        this.advertencia = advertencia;

     }
     @Override
     public void trabalhando(){
        System.out.println("Diretora esta trabalhando");
     }
     public void Supervisionar(){

        System.ou.printlm("Diretora esta supervisionando os professores");


     }
}
