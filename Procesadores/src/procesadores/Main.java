package procesadores;
import procesadores.Procesadores;
public class Main {
    public static void main(String[] args) {
        //parte 1
        Procesadores_AMD p1=new Procesadores_AMD();
        Procesadores_AMD p10=new Procesadores_AMD(12, 4.67, 9.76, "Ryzen 7", "R7MD", true);
        //parte 2
        Procesadores_Intel p2=new Procesadores_Intel();
        Procesadores_Intel p20=new Procesadores_Intel(16, 4.56, 8.98, "Core i9", "IC9", false);
        //parte 3
        Procesadores_móviles p3=new Procesadores_móviles();
        Procesadores_móviles p30=new Procesadores_móviles(8, 2.45, 4.65, "Snapdragon", true);

    }
}