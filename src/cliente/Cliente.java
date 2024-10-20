package cliente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Cliente {
    public String id, apellidos, nombre, CURP;
    private String direccion;
    public LocalDate fechaNacimiento;


    public Cliente(String id, String apellidos, String nombre, String CURP, String direccion, LocalDate fechaNacimiento) {
        this.id = id;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.CURP = CURP;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getId() {
        return id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCURP() {
        return CURP;
    }

    public String getDireccion() {
        return direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}

