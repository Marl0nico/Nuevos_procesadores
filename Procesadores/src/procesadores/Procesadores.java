package procesadores;
public class Procesadores {
    int núcleos;
    double consumo, velocidad;
    String nombre;
    public Procesadores() {
    }
    public Procesadores(int núcleos, double consumo, double velocidad, String nombre) {
        this.núcleos = núcleos;
        this.consumo = consumo;
        this.velocidad = velocidad;
        this.nombre = nombre;
    }
    public int getNúcleos() {
        return núcleos;
    }
    public void setNúcleos(int núcleos) {
        this.núcleos = núcleos;
    }
    public double getConsumo() {
        return consumo;
    }
    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    public double getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
