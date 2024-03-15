public class persona {
    private int id;
    private String nombres;
    private String Apellidos;
    private int edad;

    public persona() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "persona{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}
