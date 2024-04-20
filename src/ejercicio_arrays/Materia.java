package ejercicio_arrays;

import java.util.HashMap;
import java.util.Map;

public class Materia {
    private String nombre;
    private Map<String, Double> notas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.notas = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Map<String, Double> getNotas() {
        return notas;
    }

    public void agregarNota(String tipo, double nota) {
        notas.put(tipo, nota);
    }
}