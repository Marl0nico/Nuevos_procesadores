public class Heptágono extends Figuras_Geométricas{
    double longitudLado;
    public Heptágono() {
    }
    public Heptágono(String nombre, int nLados) {
        super(nombre, nLados);
    }
    public Heptágono(double longitudLado) {
        this.longitudLado = longitudLado;
    }
    public double getLongitudLado() {
        return longitudLado;
    }
    public void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }
    public double calcularÁrea(){
        return 3.6339*Math.pow(longitudLado, 2);
    }
    public double calcularPerímetro(){
        return 7*longitudLado;
    }
}
