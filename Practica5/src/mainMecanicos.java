package Practicas3erTri.Practica5.Practica5.src;

import java.util.Scanner;

public class mainMecanicos {
    public static void main(String[] args) throws Exception {
        menu();
    }

    public static void menu() {
        Scanner sc= new Scanner(System.in);
        boolean menu = true;
        int opcion = 0;
        GrupoTrabajos grupotrabajo = new GrupoTrabajos();

        do {
            System.out.println("Selecciona una opcion");
            System.out.println("1. Registrar trabajo");
            System.out.println("2. Aumentar horas");
            System.out.println("3. Aumenta coste de piezas");
            System.out.println("4. Finalizar trabajo");
            System.out.println("5. Muestra trabajo");
            System.out.println("6. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    grupotrabajo.newTrabajo();
                    break;
                case 2:
                    grupotrabajo.aumentaHoras();
                    break;
                case 3:
                    grupotrabajo.AumentaCostePiezas();
                    break;
                case 4:
                    grupotrabajo.finalizarTrabajo();
                    break;
                case 5:
                    grupotrabajo.mostrarTodos();
                    break;
                case 6:
                    menu = false;
                    break;
                default:
                    System.out.println("Introduce una opcion valida");
                    break;
            }
        } while (menu);
    }

}
