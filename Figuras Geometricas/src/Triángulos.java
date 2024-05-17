public class Triángulos extends Figuras_Geométricas{
    double base;
    double altura;
    public Triángulos(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public Triángulos() {

    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double calcularÁrea(){
        return (base*altura)/2;
    }
}
