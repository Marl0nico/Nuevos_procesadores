public class Figuras_Geométricas {
    String nombre;
    int nLados;
    public Figuras_Geométricas(String nombre, int nLados) {
        this.nombre = nombre;
        this.nLados = nLados;
    }
    public Figuras_Geométricas() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getnLados() {
        return nLados;
    }
    public void setnLados(int nLados) {
        this.nLados = nLados;
    }
}
