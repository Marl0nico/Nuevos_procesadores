public class Hotel {
    //definición de atributos de la clase
    String nombre, dirección, cadena;
    int calificación;
    //constructor con parámetros
    public Hotel(String nombre, String dirección, String cadena, int calificación) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.cadena = cadena;
        this.calificación = calificación;
    }
    //constructor vacío
    public Hotel() {
    }
    //setters y getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCadena() {
        return cadena;
    }
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    public String getDirección() {
        return dirección;
    }
    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
    public int getCalificación() {
        return calificación;
    }
    public void setCalificación(int calificación) {
        this.calificación = calificación;
    }
    //creación de métodos personalizados que permiten cambiar los valores de los atributos de los objetos
    public void cambiarNombre(String nuevoNombre){
        System.out.println("El nuevo nombre del hotel es:"+nuevoNombre);
    }
    public void cambiarDirección(String nuevaDirección){
        System.out.println("La nueva dirección del hotel es:"+nuevaDirección);
    }
    public void cambiarCalificación(int nuevaCalificación){
        System.out.println("La nueva calificación del hotel es:"+nuevaCalificación+" estrellas");
    }
    public void cambiarCadena(String nuevaCadena){
        System.out.println("¿El hotel pertenece a una cadena de hoteles? (Si/No):"+nuevaCadena);
    }
    //método personalizado que muestra la información en pantalla
    public void mostrarDatos(){
        System.out.println("Datos del hotel");
        System.out.println("Nombre:"+this.getNombre());
        System.out.println("Dirección:"+this.getDirección());
        System.out.println("¿El hotel pertenece a una cadena de hoteles? (Si/No):"+this.getCadena());
        System.out.println("Calificación del hotel (1-5):"+this.getCalificación()+" estrellas");
    }
}
