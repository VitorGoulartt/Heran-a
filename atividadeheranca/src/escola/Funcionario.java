public class Funcionario {

    private String nome;
    private int idade;
    private long cpf;

    public Funcionario(string nome, int idade, long cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;

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
    public long getcpf(){
        return cpf;


    }
    public void setcpf(long cpf){

        this.cpf = cpf;

    }

    public void trabalhando(){

        System.out.println("Funcionario esta trabalhando");

    }
    public void descanso(){
        System.out.println(" esta na hora de descanso");
    }

}
