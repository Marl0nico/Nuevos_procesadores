public class Main {
    public static void main(String[] args) {
        Figuras_Geométricas figura1=new Figuras_Geométricas();
        //objetos círculo
        //Círculos círculo1=new Círculos();
        //Círculos círculo2= new Círculos(5.25);
        //objetos triángulo
        Triángulos triángulo1=new Triángulos();
        Triángulos triángulo2=new Triángulos(8.56, 12.67, 15.09);
        //objetos cuadrilátero
        Cuadriláteros cuadrilátero1=new Cuadriláteros();
        Cuadriláteros cuadrilátero2=new Cuadriláteros(3.56, 6.54);
        //objetos pentágono

        //objetos hexágono

        //objetos heptágono

        //objetos octágono

        //objetos nonágono

        //objetos decágono

        //objetos undecágono

        //objetos dodecágono

        //círculo 1
        /*System.out.println("Círculo 1");
        círculo1.setRadio(4.65);
        System.out.println(círculo1.getRadio());
        círculo1.setNombre("Pileta CEC");
        System.out.println(círculo1.getNombre());
        círculo1.setRadio(8.45);
        System.out.println("La nueva pileta del CEC tendrá un radio de:"+círculo1.getRadio());
        System.out.println("Su área será:"+Double.parseDouble(String.format("%.2f", círculo1.calcularÁrea())));
        System.out.println("Su perímetro es:"+Double.parseDouble(String.format("%.2f", círculo1.calcularPerímetro())));*/
        //cuadriláteros
        System.out.println("Cuadrilátero 1");
        cuadrilátero1.setAncho(5.67);
        cuadrilátero1.setLargo(8.09);
        System.out.println("Largo:"+cuadrilátero1.getLargo()+"  Ancho:"+cuadrilátero1.getAncho());
        System.out.println("Área:"+cuadrilátero1.calcularÁrea());
        System.out.println("Perímetro:"+cuadrilátero1.calcularPerímetro());
        System.out.println("Cuadrilátero 2");
        System.out.println("Largo:"+cuadrilátero2.getLargo()+"  Ancho:"+cuadrilátero2.getAncho());
        System.out.println("Perímetro:"+cuadrilátero2.calcularPerímetro());
        System.out.println("Área:"+cuadrilátero2.calcularÁrea());
        System.out.println("------------------------------------");
        //triángulos
        System.out.println("Triángulo 1");
        triángulo1.setBase(5.32);
        triángulo1.setAltura(7.39);
        triángulo1.setHipotenusa(9.98);
        System.out.println("Base:"+triángulo1.getBase()+"   Altura:"+triángulo1.getAltura());
        System.out.println("Área:"+triángulo1.calcularÁrea());
        System.out.println("Perímetro:"+triángulo1.calcularPerímetro());
        System.out.println("Triángulo 2");
        System.out.println("Base:"+triángulo2.getBase()+"   Altura:"+triángulo2.getAltura()+"   Hipotenusa:"+triángulo2.getHipotenusa());
        System.out.println("Perímetro:"+triángulo2.calcularPerímetro());
        System.out.println("Área:"+triángulo2.calcularÁrea());
        System.out.println("-----------------------------------");
        //pentágono

    }
}