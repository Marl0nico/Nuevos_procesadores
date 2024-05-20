public class Pentágono extends Figuras_Geométricas{
    double longitudLado;
    public Pentágono() {
    }
    public Pentágono(String nombre, int nLados, double longitudLado) {
        super(nombre, nLados);
    }
    public Pentágono(double longitudLado) {
        this.longitudLado = longitudLado;
    }
    public double getLongitudLado() {
        return longitudLado;
    }
    public void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }
    public double calcularÁrea(){
        return (0.25*Math.pow(longitudLado, 2)*Math.sqrt(5*(5+(2*Math.sqrt(5)))));
    }
    public double calcularPerímetro(){
        return 5*longitudLado;
    }
}
