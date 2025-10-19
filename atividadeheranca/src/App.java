import escola.Funcionario;
import escola.Coordenadora;
import escola.Limpeza;
import escola.Professor;


public class App {
    public static void main(String[] args)  {
        Funcionario func1 = new Funcionario("rafaelo", 0, 2000);
        func1.Fazer();
        func1.descanso(func1.getnome());

        System.out.println();

        Coordenadora coordena = new Coordenadora("jjulia", 45 , 01321332, "Suspensos");

        coordena.Fazer();

        coordena.Suspensao();
        coordena.descanso(coordena.getnome());

        System.out.println();

        Limpeza tia = new Limpeza("micael", 45, 1432,  "Sala de aula");


        tia.Fazer();
        tia.ajudando();
        tia.descanso(tia.getnome());

        System.out.println();

        Professor prof = new Professor("Murilo", 38, 1214, "Fisica");

        prof.Fazer();
        prof.aula();
        prof.descanso(prof.getnome());

        System.out.println();


        
    }
}
