public class Triángulos extends Figuras_Geométricas{
    double base, altura, hipotenusa;
    public Triángulos(double base, double altura, double hipotenusa) {
        this.base = base;
        this.altura = altura;
        this.hipotenusa=hipotenusa;
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
    public double getHipotenusa() {
        return hipotenusa;
    }
    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }
    public double calcularÁrea(){
        return (base*altura)/2;
    }
    public double calcularPerímetro(){
        return base+altura+hipotenusa;
    }
}
