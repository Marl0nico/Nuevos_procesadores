public class Main {
    public static void main(String[] args) {
        Figuras_Geométricas figura1=new Figuras_Geométricas();
        Círculos círculo1=new Círculos();
        Triángulos triángulo1=new Triángulos();
        Cuadriláteros cuadrilátero1=new Cuadriláteros();
        Pentágono pentágono1=new Pentágono(5.45);
        Pentágono pentágono2=new Pentágono();
        Círculos círculo2= new Círculos(5.25);
        Triángulos triángulo2=new Triángulos(8.56, 12.67, 15.09);
        Cuadriláteros cuadrilátero2=new Cuadriláteros(3.56, 6.54);
        Cuadriláteros cuadrilátero3=new Cuadriláteros(4.56, 2.45);
        //círculo 1
        System.out.println("Círculo 1");
        círculo1.setRadio(4.65);
        System.out.println(círculo1.getRadio());
        círculo1.setNombre("Pileta CEC");
        System.out.println(círculo1.getNombre());
        círculo1.setRadio(8.45);
        System.out.println("La nueva pileta del CEC tendrá un radio de:"+círculo1.getRadio());
        System.out.println("Su área será:"+Double.parseDouble(String.format("%.2f", círculo1.calcularÁrea())));
        System.out.println("Su perímetro es:"+Double.parseDouble(String.format("%.2f", círculo1.calcularPerímetro())));
        //cuadrilátero 1
        System.out.println("Cuadrilátero 1");
        cuadrilátero1.setAncho(5.67);
        cuadrilátero1.setLargo(8.09);
        System.out.println("Largo:"+cuadrilátero1.getLargo()+"  Ancho:"+cuadrilátero1.getAncho());
        System.out.println("Área:"+cuadrilátero1.calcularÁrea());
        System.out.println("Perímetro:"+cuadrilátero1.calcularPerímetro());
        //triángulo 1
        System.out.println("Triángulo 1");
        triángulo1.setBase(5.32);
        triángulo1.setAltura(7.39);
        triángulo1.setHipotenusa(9.98);
        System.out.println("Base:"+triángulo1.getBase()+"   Altura:"+triángulo1.getAltura());
        System.out.println("Área:"+triángulo1.calcularÁrea());
        System.out.println("Perímetro:"+triángulo1.calcularPerímetro());
        //pentágono
        System.out.println("Pentágono 1");
        
        //deber: leer Deitel sobre herencia y consultar y activar su cuenta estudiantil de github
        //deber: terminar de hacer el ejercicio y probarlo en el main
        //primer commit
        //segundo commit y push en github
    }
}