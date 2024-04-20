package ejercicio_arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Persona> personas = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Registrar persona");
            System.out.println("2. Registrar materia y notas");
            System.out.println("3. Mostrar registros");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarPersona();
                    break;
                case 2:
                    registrarMateriaYNotas();
                    break;
                case 3:
                    mostrarRegistros();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 4);
    }

    private static void registrarPersona() {
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.next();
        Persona persona = new Persona(nombre);
        personas.add(persona);
        System.out.println("Persona registrada con éxito.");
    }

    private static void registrarMateriaYNotas() {
        System.out.print("Ingrese el nombre de la persona: ");
        String nombrePersona = scanner.next();
        Persona persona = buscarPersona(nombrePersona);
        if (persona == null) {
            System.out.println("Persona no encontrada.");
            return;
        }

        System.out.print("Ingrese el nombre de la materia: ");
        String nombreMateria = scanner.next();
        Materia materia = new Materia(nombreMateria);

        System.out.print("Ingrese la nota 1: ");
        double nota1 = scanner.nextDouble();
        materia.agregarNota("Nota1", nota1);

        System.out.print("Ingrese la nota 2: ");
        double nota2 = scanner.nextDouble();
        materia.agregarNota("Nota2", nota2);

        System.out.print("Ingrese la nota 3: ");
        double nota3 = scanner.nextDouble();
        materia.agregarNota("Nota3", nota3);

        persona.agregarMateria(materia);
        System.out.println("Materia y notas registradas con éxito.");
    }

    private static void mostrarRegistros() {
        System.out.println("Personas registradas:");
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre());
            for (Materia materia : persona.getMaterias()) {
                System.out.println("Materia: " + materia.getNombre());
                Map<String, Double> notas = materia.getNotas();
                System.out.println("Notas:");
                System.out.println("Nota 1: " + notas.get("Nota1"));
                System.out.println("Nota 2: " + notas.get("Nota2"));
                System.out.println("Nota 3: " + notas.get("Nota3"));
            }
            System.out.println("-------------------------");
        }
    }

    private static Persona buscarPersona(String nombre) {
        for (Persona persona : personas) {
            if (persona.getNombre().equalsIgnoreCase(nombre)) {
                return persona;
            }
        }
        return null;
    }
}