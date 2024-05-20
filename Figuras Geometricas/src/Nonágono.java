public class Nonágono extends Figuras_Geométricas{
    double longitudLado;
    public Nonágono(double longitudLado) {
        this.longitudLado = longitudLado;
    }
    public Nonágono() {
    }
    public double getLongitudLado() {
        return longitudLado;
    }
    public void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }
    public double calcularÁrea(){
        return 6.1818*Math.pow(longitudLado, 2);
    }
    public double calcularPerímetro(){
        return 9*longitudLado;
    }
}
