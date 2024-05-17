public class Círculos extends Figuras_Geométricas{
    double radio;
    public Círculos(double radio) {

    }
    public Círculos(){}
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double calcularÁrea(){
        return Math.PI*radio*radio;
    }
}
