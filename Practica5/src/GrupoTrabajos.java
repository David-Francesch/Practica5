import java.util.ArrayList;
import java.util.Scanner;

public class GrupoTrabajos {
    
    private ArrayList<Trabajos> trabajo = new ArrayList<>();
    

    public GrupoTrabajos(){
        
    }

    public void newTrabajo() {
        Scanner sc= new Scanner(System.in);
        Scanner sci= new Scanner(System.in);
        String descripcion;
        int opcion;

        System.out.println("Que tipo de trabajo quieres empezar:");
        System.out.println("1. Reparacion mecanica");
        System.out.println("2. Reparacion chapa y pintura");
        System.out.println("3. Revision");
        opcion = sci.nextInt();

        System.out.println("Introduce la descripcion del trabajo");
        descripcion = sc.nextLine();

        
        Trabajos test = new Trabajos(trabajo.size(),opcion, descripcion , 0, false);
        trabajo.add(test);
        mostrarTrabajo();
    }

    public void mostrarTrabajo() {
        System.out.println(trabajo.get(trabajo.size()-1).toString());
    }
}
