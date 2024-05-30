import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nombreEstudiante, apellidoEstudiante, correoEstudiante; //variables de la clase estudiante
        String nombreMateria, profesorMateria; //variables de la clase materia
        int edad, ci;
        double nota1, nota2, nota3, nota4, nota5;
        Scanner scanner=new Scanner(System.in);
        Estudiante[] estudiantes=new Estudiante[3];
        for(int i=0; i<3; i++){
            System.out.println("Estudiante "+(i+1));
            System.out.println("Nombre: ");
            nombreEstudiante=scanner.next();
            System.out.println("Apellido: ");
            apellidoEstudiante=scanner.next();
            System.out.println("Correo: ");
            correoEstudiante=scanner.next();
            System.out.println("Edad: ");
            edad=scanner.nextInt();
            System.out.println("Cédula: ");
            ci=scanner.nextInt();
            System.out.println("Materia: ");
            nombreMateria=scanner.next();
            System.out.println("Profesor: ");
            profesorMateria=scanner.next();
            System.out.println("Nota 1: ");
            nota1=scanner.nextDouble();
            System.out.println("Nota 2: ");
            nota2=scanner.nextDouble();
            System.out.println("Nota 3: ");
            nota3=scanner.nextDouble();
            System.out.println("Nota 4: ");
            nota4=scanner.nextDouble();
            System.out.println("Nota 5: ");
            nota5=scanner.nextDouble();
        }
        for (Estudiante estudiante : estudiantes) {
            //estudiante.datosEstudiante();
            System.out.println("----------------------------------");
        }
    }
}