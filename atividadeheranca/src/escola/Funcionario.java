package escola;

public class Funcionario {

    private String nome;
    private int idade;
    private int salario ;

    public Funcionario(String nome, int idade, int salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;

    }
    public String getnome(){
        return nome;

    }
    public void setnome(String nome){
        this.nome = nome;

    }public int getidade(){
        return idade;

    }
    public void setidade(int idade){
        this.idade = idade;

    }
    public long getsalario(){
        return salario;


    }
    public void setsalario(int salario){

        this.salario = salario;

    }

    public void Fazer(){

        System.out.println(" Agora esta trabalhando");

    }
    public void descanso(String nome){
        this.nome = nome;
        System.out.println(this.nome + " Agora esta na hora do almoco");
    }

}
