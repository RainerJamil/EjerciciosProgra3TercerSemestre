package ejercicio2;

public class Libro {
    String NombreLibro;
    String Autor;
    String Categoria;

    public Libro(String nombreLibro, String autor, String categoria) {
        NombreLibro = nombreLibro;
        Autor = autor;
        Categoria = categoria;
    }

    public String getNombreLibro() {
        return NombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        NombreLibro = nombreLibro;
    }


    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }
    public String toString(){
        return "Libro: "+NombreLibro+", Autor: "+Autor+" ,"+"Categoria :"+Categoria;
    }
}
