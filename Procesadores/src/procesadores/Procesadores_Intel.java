package procesadores;
public class Procesadores_Intel extends Procesadores_escritorio{
    boolean tarjeta_video;
    public Procesadores_Intel() {
    }
    public Procesadores_Intel(int núcleos, double consumo, double velocidad, String nombre, String socket, boolean tarjeta_video) {
        super(núcleos, consumo, velocidad, nombre, socket);
        this.tarjeta_video = tarjeta_video;
    }
    public boolean isTarjeta_video() {
        return tarjeta_video;
    }
    public void setTarjeta_video(boolean tarjeta_video) {
        this.tarjeta_video = tarjeta_video;
    }
    void imprimir_datos_intel(){
        System.out.println(this.tarjeta_video);
    }
}
