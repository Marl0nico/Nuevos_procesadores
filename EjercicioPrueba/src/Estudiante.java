public class Estudiante {
    String nombre, correo, apellido;
    int edad, ci;
    public Estudiante() {
    }
    public Estudiante(String nombre, String correo, String apellido, int edad, int ci) {
        this.nombre = nombre;
        this.correo = correo;
        this.apellido = apellido;
        this.edad = edad;
        this.ci = ci;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getCi() {
        return ci;
    }
    public void setCi(int ci) {
        this.ci = ci;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    private void datosEstudiante(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Correo: "+getCorreo());
        System.out.println("Cédula: "+getCi());
        System.out.println("Edad: "+getEdad());
    }
}
