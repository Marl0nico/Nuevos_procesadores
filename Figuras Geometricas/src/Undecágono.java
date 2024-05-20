public class Undecágono extends Figuras_Geométricas{
    double longitudLado;
    public Undecágono() {
    }
    public Undecágono(double longitudLado) {
        this.longitudLado = longitudLado;
    }
    public double getLongitudLado() {
        return longitudLado;
    }
    public void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }
    public double calcularÁrea(){
        return 9.3656*Math.pow(longitudLado, 2);
    }
    public double calcularPerímetro(){
        return 11*longitudLado;
    }
}
