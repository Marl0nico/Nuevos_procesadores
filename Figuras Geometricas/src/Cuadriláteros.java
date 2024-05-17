public class Cuadriláteros extends Figuras_Geométricas{
    double largo;
    double ancho;
    public Cuadriláteros(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    public Cuadriláteros() {

    }
    public double getLargo() {
        return largo;
    }
    public void setLargo(double largo) {
        this.largo = largo;
    }
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public double calcularÁrea(){
        return largo*ancho;
    }
}
