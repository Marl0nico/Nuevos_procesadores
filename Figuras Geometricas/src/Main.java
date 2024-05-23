public class Main {
    public static void main(String[] args) {
        Figuras_Geométricas figura1=new Figuras_Geométricas();

        //objetos triángulos
        Triángulos triángulo1=new Triángulos();
        Triángulos triángulo2=new Triángulos(8.56, 12.67, 15.09);

        //objetos cuadriláteros
        Cuadriláteros cuadrilátero1=new Cuadriláteros();
        Cuadriláteros cuadrilátero2=new Cuadriláteros(3.56, 6.54);

        //objetos Pentagonos
        Pentágono pentagono1=new Pentágono();
        Pentágono pentagono2=new Pentágono(8.95);

        //objetos Hexagonos
        Hexágono hexagono1=new Hexágono();
        Hexágono hexagono2=new Hexágono(12.4);

        //objetos Heptagonos
        Heptágono heptagono1=new Heptágono();
        Heptágono heptagono2=new Heptágono(4.7);

        //objetos Octagonos
        Octágono octagono1=new Octágono();
        Octágono octagono2=new Octágono(13.2);

        //objetos Nonagonos
        Nonágono nonagono1=new Nonágono();
        Nonágono nonagono2=new Nonágono(9.34);

        //objetos Decagonos
        Decágono decagono1=new Decágono();
        Decágono decagono2=new Decágono(7.88);

        //objetos Undecagonos
        Undecágono undecagono1=new Undecágono();
        Undecágono undecagono2=new Undecágono(5.99);

        //objetos Dodecagonos
        Dodecágono dodecagono1=new Dodecágono();
        Dodecágono dodecagono2=new Dodecágono(9.20);

        //Triángulos
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
        System.out.println("-----------------------------------------");
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
        System.out.println("-----------------------------------------");
        System.out.println("Cuadrilátero 2");
        System.out.println("Largo:"+cuadrilátero2.getLargo()+"  Ancho:"+cuadrilátero2.getAncho());
        System.out.println("Perímetro:"+cuadrilátero2.calcularPerímetro());
        System.out.println("Área:"+cuadrilátero2.calcularÁrea());
        System.out.println("-----------------------------------------");

        //Pentagonos
        cuadrilátero1.setNombre("Figura geométrica: Pentágonos");
        System.out.println(pentagono1.getNombre());
        pentagono1.setnLados(5);
        System.out.println("Número de lados:"+pentagono1.getnLados());
        System.out.println("Pentagono 1");
        pentagono1.setLongitudLado(7.8);
        System.out.println("Área:"+pentagono1.calcularÁrea());
        System.out.println("Perímetro:"+pentagono1.calcularPerímetro());
        System.out.println("-----------------------------------------");
        System.out.println("Pentagono 2");
        System.out.println("Área:"+pentagono2.calcularÁrea());
        System.out.println("Perímetro:"+pentagono2.calcularPerímetro());
        System.out.println("-----------------------------------------");

        //Hexagonos
        hexagono1.setNombre("Figura geométrica: Hexagonos");
        System.out.println(hexagono1.getNombre());
        hexagono1.setnLados(6);
        System.out.println("Número de lados:"+hexagono1.getnLados());
        System.out.println("Hexagono 1");
        hexagono1.setLongitudLado(7.8);
        System.out.println("Área:"+hexagono1.calcularÁrea());
        System.out.println("Perímetro:"+hexagono1.calcularPerímetro());
        System.out.println("-----------------------------------------");
        System.out.println("Hexagono 2");
        System.out.println("Área:"+hexagono2.calcularÁrea());
        System.out.println("Perímetro:"+hexagono2.calcularPerímetro());
        System.out.println("-----------------------------------------");

        //Heptagonos
        heptagono1.setNombre("Figura geométrica: Heptagonos");
        System.out.println(heptagono1.getNombre());
        heptagono1.setnLados(7);
        System.out.println("Número de lados:"+heptagono1.getnLados());
        System.out.println("Heptagono 1");
        heptagono1.setLongitudLado(9.20);
        System.out.println("Área:"+heptagono1.calcularÁrea());
        System.out.println("Perímetro:"+heptagono1.calcularPerímetro());
        System.out.println("-----------------------------------------");
        System.out.println("Heptagono 2");
        System.out.println("Área:"+heptagono2.calcularÁrea());
        System.out.println("Perímetro:"+heptagono2.calcularPerímetro());
        System.out.println("-----------------------------------------");

        //Octagono
        heptagono1.setNombre("Figura geométrica: Octagonos");
        System.out.println(octagono1.getNombre());
        heptagono1.setnLados(8);
        System.out.println("Número de lados:"+octagono1.getnLados());
        System.out.println("Octagono 1");
        octagono1.setLongitudLado(23.45);
        System.out.println("Área:"+octagono1.calcularÁrea());
        System.out.println("Perímetro:"+octagono1.calcularPerímetro());
        System.out.println("-----------------------------------------");
        System.out.println("Octagono 2");
        System.out.println("Área:"+octagono2.calcularÁrea());
        System.out.println("Perímetro:"+octagono2.calcularPerímetro());
        System.out.println("-----------------------------------------");

        //Nonagonos
        nonagono1.setNombre("Figura geométrica: Nonagonos");
        System.out.println(nonagono1.getNombre());
        heptagono1.setnLados(9);
        System.out.println("Número de lados:"+nonagono1.getnLados());
        System.out.println("Nonagono 1");
        nonagono1.setLongitudLado(13.4);
        System.out.println("Área:"+nonagono1.calcularÁrea());
        System.out.println("Perímetro:"+nonagono1.calcularPerímetro());
        System.out.println("-----------------------------------------");
        System.out.println("Nonagono 2");
        System.out.println("Área:"+nonagono2.calcularÁrea());
        System.out.println("Perímetro:"+nonagono2.calcularPerímetro());
        System.out.println("-----------------------------------------");

        //Decagonos
        decagono1.setNombre("Figura geométrica: Decagonos");
        System.out.println(decagono1.getNombre());
        decagono1.setnLados(10);
        System.out.println("Número de lados:"+decagono1.getnLados());
        System.out.println("Decagono 1");
        decagono1.setLongitudLado(10.9);
        System.out.println("Área:"+decagono1.calcularÁrea());
        System.out.println("Perímetro:"+decagono1.calcularPerímetro());
        System.out.println("-----------------------------------------");
        System.out.println("Decagono 2");
        System.out.println("Área:"+decagono2.calcularÁrea());
        System.out.println("Perímetro:"+decagono2.calcularPerímetro());
        System.out.println("-----------------------------------------");

        //Undecagono
        decagono1.setNombre("Figura geométrica: Undecagonos");
        System.out.println(undecagono1.getNombre());
        decagono1.setnLados(11);
        System.out.println("Número de lados:"+undecagono1.getnLados());
        System.out.println("Undecagono 1");
        undecagono1.setLongitudLado(8.99);
        System.out.println("Área:"+undecagono1.calcularÁrea());
        System.out.println("Perímetro:"+undecagono1.calcularPerímetro());
        System.out.println("-----------------------------------------");
        System.out.println("Undecagono 2");
        System.out.println("Área:"+undecagono2.calcularÁrea());
        System.out.println("Perímetro:"+undecagono2.calcularPerímetro());
        System.out.println("-----------------------------------------");

        //Dodecagono
        dodecagono1.setNombre("Figura geométrica: Dodecagonos");
        System.out.println(dodecagono1.getNombre());
        decagono1.setnLados(12);
        System.out.println("Número de lados:"+dodecagono1.getnLados());
        System.out.println("Dodecagono 2");
        dodecagono1.setLongitudLado(13.5);
        System.out.println("Área:"+dodecagono1.calcularÁrea());
        System.out.println("Perímetro:"+dodecagono1.calcularPerímetro());
        System.out.println("-----------------------------------------");
        System.out.println("Dodecagono 2");
        System.out.println("Área:"+dodecagono2.calcularÁrea());
        System.out.println("Perímetro:"+dodecagono2.calcularPerímetro());
        System.out.println("-----------------------------------------");


    }
}