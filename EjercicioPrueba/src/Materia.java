public class Materia {
    String nombre, profesor;
    double nota1, nota2, nota3, nota4, nota5, promedio;
    public Materia(String nombre, String profesor, double nota1, double nota2, double nota3, double nota4, double nota5, double promedio) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
        this.promedio=promedio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getProfesor() {
        return profesor;
    }
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota3() {
        return nota3;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getNota4() {
        return nota4;
    }
    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }
    public double getNota5() {
        return nota5;
    }
    public void setNota5(double nota5) {
        this.nota5 = nota5;
    }
    public double getPromedio() {
        return promedio;
    }
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    public double promedio(double nota1, double nota2, double nota3, double nota4, double nota5){
        promedio=(nota1+nota2+nota3+nota4+nota5)/5;
        return promedio;
    }
    public double notaMáxima(){
        //notaMáxima=Math.max(nota1, nota2);
        //return notaMáxima;
        return 0.0;
    }
    private double notaMínima(){
        return 0.0;
    }
    public void datosMateria(){
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Profesor: "+getProfesor());
        System.out.println("Nota 1: "+getNota1());
        System.out.println("Nota2 :"+getNota2());
        System.out.println("Nota 3: "+getNota3());
        System.out.println("Nota 4: "+getNota4());
        System.out.println("Nota 5: "+getNota5());
        System.out.println("Promedio: "+getPromedio());
    }
}
