public class Dodecágono extends Figuras_Geométricas{
    double longitudLado;
    public Dodecágono() {
    }
    public Dodecágono(double longitudLado) {
        this.longitudLado = longitudLado;
    }
    public double getLongitudLado() {
        return longitudLado;
    }
    public void setLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
    }
    public double calcularÁrea(){
        return Math.pow(longitudLado, 2)*(6+(3*Math.sqrt(3)));
    }
    public double calcularPerímetro(){
        return longitudLado*12;
    }
}
