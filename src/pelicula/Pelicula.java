package pelicula;

import pelicula.utils.Categoria;
import java.time.LocalDate;
import java.time.LocalTime;

public class Pelicula {

    public String Nombre, Sinopsis, ID;
    public LocalTime Duracion;
    public LocalDate FechaFuncion;
    public Categoria categoria;

    public Pelicula(String ID, String nombre, LocalTime duracion, LocalDate FechaFuncion, String Sinopsis, Categoria categoria) {

        this.ID = ID;
        this.Nombre = nombre;
        this.Duracion = duracion;
        this.Sinopsis = Sinopsis;
        this.FechaFuncion = FechaFuncion;
        this.categoria = categoria;
    }

    public String getNombre() {
        return Nombre;
    }
    public String getSinopsis() {
        return Sinopsis;
    }
    public String getID() {
        return ID;
    }
    public LocalTime getDuracion() {
        return Duracion;
    }
    public LocalDate getFechaFuncion() {
        return FechaFuncion;
    }
    public Categoria getCategoria() {
        return categoria;
    }

    public String mostrarPelicula(){
        String info=String.format("ID: %s, Nombre: %s, Categoría: %s, Duración: %s, Sinópsis: %s, Fecha: %s",
                getID(), getNombre(), getCategoria(), getDuracion(), getSinopsis(), getFechaFuncion());
        return info;
    }
}
