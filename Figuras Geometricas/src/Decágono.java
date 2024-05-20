public class Decágono extends Figuras_Geométricas{
    double longitudLado;
    public Decágono() {
    }
    public Decágono(double longitudLado) {
        this.longitudLado = longitudLado;
    }
    public double getLongitudLado() {
        return longitudLado;
    }
    public void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }
    public double calcularÁrea(){
        return 7.6942*Math.pow(longitudLado, 2);
    }
    public double calcularPerímetro(){
        return 10*longitudLado;
    }
}
