public class Videojuego {
    String nombre, plataforma, calificación, empresa, descripción, categoría;
    int añoLanzamiento, stock;
    double versión, precio;
    public Videojuego(String nombre, String plataforma, String calificación, String empresa, String descripción, String categoría, int añoLanzamiento, int stock, double versión, double precio) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.calificación = calificación;
        this.empresa = empresa;
        this.descripción = descripción;
        this.categoría = categoría;
        this.añoLanzamiento = añoLanzamiento;
        this.stock = stock;
        this.versión = versión;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPlataforma() {
        return plataforma;
    }
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    public String getCalificación() {
        return calificación;
    }
    public void setCalificación(String calificación) {
        this.calificación = calificación;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getDescripción() {
        return descripción;
    }
    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }
    public String getCategoría() {
        return categoría;
    }
    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }
    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }
    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public double getVersión() {
        return versión;
    }
    public void setVersión(double versión) {
        this.versión = versión;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void mostrarInformación(){
        System.out.println("Nombre:"+getNombre());
        System.out.println("Plataforma:"+getPlataforma());
        System.out.println("Descripción:"+getDescripción());
        System.out.println("Calificación:"+getCalificación());
        System.out.println("Empresa:"+getEmpresa());
        System.out.println("Categoría:"+getCategoría());
        System.out.println("Año de lanzamiento:"+getAñoLanzamiento());
        System.out.println("Stock:"+getStock());
        System.out.println("Versión:"+getVersión());
        System.out.println("Precio:"+getPrecio());
    }
}
