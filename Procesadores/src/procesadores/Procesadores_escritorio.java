package procesadores;
public class Procesadores_escritorio extends Procesadores{
    String socket;
    public Procesadores_escritorio() {
    }
    public Procesadores_escritorio(int núcleos, double consumo, double velocidad, String nombre, String socket) {
        super(núcleos, consumo, velocidad, nombre);
        this.socket = socket;
    }
    public String getSocket() {
        return socket;
    }
    public void setSocket(String socket) {
        this.socket = socket;
    }
    void imprimir_datos_escritorio(){
        System.out.println(this.socket);
    }
}
