public class Hexágono extends Figuras_Geométricas{
    double longitudLado;
    public Hexágono() {
    }
    public Hexágono(String nombre, int nLados) {
        super(nombre, nLados);
    }
    public Hexágono(double longitudLado) {
        this.longitudLado = longitudLado;
    }
    public double getLongitudLado() {
        return longitudLado;
    }
    public void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }
    public double calcularÁrea(){
        return ((3*Math.sqrt(3))/2*Math.pow(longitudLado, 2));
    }
    public double calcularPerímetro(){
        return 6*longitudLado;
    }
}
