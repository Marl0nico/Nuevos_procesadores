//import com.sun.corba.se.impl.orb.PrefixParserAction;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Videojuego[] videojuegos=new Videojuego[5];
        String nombre, plataforma, calificación, empresa, descripción, categoría;
        int añoLanzamiento, stock, opción;
        double versión, precio;
        do {
            System.out.println("*****Menú de opciones*****");
            System.out.println("1. Ingresar datos");
            System.out.println("2. Mostrar datos");
            System.out.println("3. Salir");
            System.out.print("Opción:");
            opción=scanner.nextInt();
            if (opción==1){
                for (int i=0; i<5; i++) {
                    System.out.println("Videojuego "+(i+1));
                    System.out.print("Nombre: ");
                    nombre=scanner.next();
                    System.out.print("Plataforma: ");
                    plataforma=scanner.next();
                    System.out.print("Descripción: ");
                    descripción=scanner.next();
                    System.out.print("Calificación: ");
                    calificación=scanner.next();
                    System.out.print("Empresa: ");
                    empresa=scanner.next();
                    System.out.print("Categoría: ");
                    categoría=scanner.next();
                    System.out.print("Año de lanzamiento: ");
                    añoLanzamiento=scanner.nextInt();
                    System.out.print("Stock: ");
                    stock=scanner.nextInt();
                    System.out.print("Versión: ");
                    versión=scanner.nextDouble();
                    System.out.print("Precio: ");
                    precio=scanner.nextDouble();
                    videojuegos[i]=new Videojuego(nombre, plataforma, descripción, calificación, empresa, categoría, añoLanzamiento, stock, versión, precio);
                }
            } else if (opción==2){
                for (Videojuego videojuego : videojuegos) {
                    videojuego.mostrarInformación();
                    System.out.println("----------------------------------");
                }
            }
        } while (opción!=3);
        if (opción==3){
            System.out.println("Ha salido del programa exitosamente");
        }
    }
}