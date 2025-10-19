package escola;


public class Limpeza extends Funcionario {
    private String limpar;
    private String limpeza = "tia da limpeza";

    public Limpeza(String nome, int idade, int salario, String limpar){
        super(nome, idade, salario);
        this.limpar = limpar;
         
    }
     @Override
    public void Fazer(){
        System.out.println("Tia da limpeza esta limpando " + this.limpar);
    }
    public void ajudando(){

        System.out.println(this.limpeza + " esta cuidando da escola");
    }

}
