import java.util.Scanner;

public class Trabajos {
    // private int idTrabajo;  hacerlo como posicion del array de trabajos
    private String descripcion;
    private int nHoras = 0;
    private boolean finalizado;

    public String getDescripcion() {
        return descripcion;
    }

    public int getnHoras() {
        return nHoras;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    private void new_r_mecanica(String descripcion, int nHoras, boolean finalizado) {
        Scanner sc= new Scanner(System.in);
        // if (this.idTrabajo > 0) {
        //     this.idTrabajo = idTrabajo++;
        // }else{
        //     this.idTrabajo = 0;
        // }
    
        System.out.println("Introduce una descripcion: ");
        this.descripcion = sc.nextLine();
    
        this.nHoras = 0;
    }
    
    private void new_r_chapapintura(int idTrabajo, String descripcion, int nHoras, boolean finalizado) {
        Scanner sc= new Scanner(System.in);
        // if (this.idTrabajo > 0) {
        //     this.idTrabajo = idTrabajo++;
        // }else{
        //     this.idTrabajo = 0;
        // }
    
        System.out.println("Introduce una descripcion: ");
        this.descripcion = sc.nextLine();
    
        this.nHoras = 0;
    }
    
    private void new_revision(String descripcion, int nHoras, boolean finalizado) {
        Scanner sc= new Scanner(System.in);
        // if (this.idTrabajo > 0) {
        //     this.idTrabajo = idTrabajo++;
        // }else{
        //     this.idTrabajo = 0;
        // }
    
        System.out.println("Introduce una descripcion: ");
        this.descripcion = sc.nextLine();
    
        this.nHoras = 0;
    }

}





