public class Profesor {
    private String nombre;
    private int edad;
    private CategoriaDocente CD;

    public Profesor(String nombre, int edad, CategoriaDocente CD) {
        this.nombre = nombre;
        this.edad = edad;
        this.CD = CD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public CategoriaDocente getCD() {
        return CD;
    }

    public void setCD(CategoriaDocente CD) {
        this.CD = CD;
    }
}
