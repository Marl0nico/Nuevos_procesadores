public class Main {
    public static void main(String[] args) {
        Figuras_Geométricas figura1=new Figuras_Geométricas();
        //objetos triángulos
        Triángulos triángulo1=new Triángulos();
        Triángulos triángulo2=new Triángulos(8.56, 12.67, 15.09);
        //objetos cuadriláteros
        Cuadriláteros cuadrilátero1=new Cuadriláteros();
        Cuadriláteros cuadrilátero2=new Cuadriláteros(3.56, 6.54);
        //triángulos
        triángulo1.setNombre("Figura geométrica: Triángulos");
        System.out.println(triángulo1.getNombre());
        triángulo1.setnLados(3);
        System.out.println("Número de lados:"+triángulo1.getnLados());
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
        System.out.println("-----------------------------------------");
        //cuadriláteros
        cuadrilátero1.setNombre("Figura geométrica: Cuadriláteros");
        System.out.println(cuadrilátero1.getNombre());
        cuadrilátero1.setnLados(4);
        System.out.println("Número de lados:"+cuadrilátero1.getnLados());
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
        System.out.println("-----------------------------------------");
    }
}