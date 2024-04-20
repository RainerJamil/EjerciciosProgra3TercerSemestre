package ejercicio_arrays;
import java.util.List;
import java.util.ArrayList;


public class Persona {
    private String nombre;
    private List<Materia> materias;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.materias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }
}