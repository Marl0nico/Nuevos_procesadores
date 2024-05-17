public class Heptágono extends Figuras_Geométricas{
    double apotema, longitudLado;
    public Heptágono() {
    }
    public Heptágono(String nombre, int nLados) {
        super(nombre, nLados);
    }
    public double calcularÁrea(){
        return 0.5*apotema*longitudLado;
    }
}
