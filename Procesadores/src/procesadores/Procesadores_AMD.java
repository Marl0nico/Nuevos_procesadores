package procesadores;
public class Procesadores_AMD extends Procesadores_escritorio{
    boolean sensor_temperatura;
    public Procesadores_AMD() {
    }
    public Procesadores_AMD(int núcleos, double consumo, double velocidad, String nombre, String socket, boolean sensor_temperatura) {
        super(núcleos, consumo, velocidad, nombre, socket);
        this.sensor_temperatura = sensor_temperatura;
    }
    public boolean isSensor_temperatura() {
        return sensor_temperatura;
    }
    public void setSensor_temperatura(boolean sensor_temperatura) {
        this.sensor_temperatura = sensor_temperatura;
    }
    void imprimir_datos_amd(){
        System.out.println(this.sensor_temperatura);
    }
}
