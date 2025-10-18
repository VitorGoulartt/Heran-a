public class porteiro extends Funcionario {
    private int camera;

    public porteiro(String nome, int idade, long cpf, int camera){
        super(nome, idade, cpf);
        this.camera = camera;
         
    }
    public void trabalhando(){
        System.out.println("Porteiro esta trabalhando");
    }

}
