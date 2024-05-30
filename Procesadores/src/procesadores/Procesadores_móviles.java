package procesadores;
public class Procesadores_móviles extends Procesadores {
    boolean optimización;
    public Procesadores_móviles() {
    }
    public Procesadores_móviles(int núcleos, double consumo, double velocidad, String nombre, boolean optimización) {
        super(núcleos, consumo, velocidad, nombre);
        this.optimización = optimización;
    }
    public boolean isOptimización() {
        return optimización;
    }
    public void setOptimización(boolean optimización) {
        this.optimización = optimización;
    }
    void imprimir_datos_móviles(){
        System.out.println(this.optimización);
    }
}
