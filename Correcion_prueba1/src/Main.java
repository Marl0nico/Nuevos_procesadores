public class Main {
    public static void main(String[] args) {
        //creación de 5 instancias de la clase Hotel junto con su quema de valores
        Hotel hotel1=new Hotel("Quito", "Norte", "No", 4);
        Hotel hotel2=new Hotel("Swisshotel", "Centro", "Si", 5);
        Hotel hotel3=new Hotel("Diablohuma", "Norte", "No", 1);
        Hotel hotel4=new Hotel("San Francisco", "Norte", "No", 3);
        Hotel hotel5=new Hotel("Trivago", "Sur", "Si", 2);
        //creación de objetos con valores nulos y seteo de los mismos
        Hotel hotel6=new Hotel();//objeto con valores nulos
        //seteo de valores del objeto hotel6
        hotel6.setNombre("Night Hotel");
        hotel6.setDirección("Sur");
        hotel6.setCadena("No");
        hotel6.setCalificación(1);
        Hotel hotel7=new Hotel();//objeto con valores nulos
        //seteo de valores del objeto hotel7
        hotel7.setNombre("Sueño profundo");
        hotel7.setDirección("Centro");
        hotel7.setCadena("No");
        hotel7.setCalificación(2);
        //modificación de 3 objetos con el valor null y visualización de los nuevos resultados
        //alteración de atributos de la instancia 1
        hotel1.setNombre(null);
        hotel1.setDirección(null);
        hotel1.setCadena(null);
        hotel1.setCalificación(0);
        //modificación de objeto 2
        hotel2.setNombre(null);
        hotel2.setDirección(null);
        hotel2.setCadena(null);
        hotel2.setCalificación(0);
        //modificación de objeto 3
        hotel3.setNombre(null);
        hotel3.setDirección(null);
        hotel3.setCadena(null);
        hotel3.setCalificación(0);
        //visualización de resultados
        hotel1.mostrarDatos();
        System.out.println("------------------------------------");
        hotel2.mostrarDatos();
        System.out.println("------------------------------------");
        hotel3.mostrarDatos();
        System.out.println("------------------------------------");
        //implementación de métodos personalizados
        hotel4.cambiarNombre("Descanso eterno");
        hotel4.cambiarDirección("Cielo");
        hotel4.cambiarCadena("Si");
        hotel4.cambiarCalificación(5);
    }
}