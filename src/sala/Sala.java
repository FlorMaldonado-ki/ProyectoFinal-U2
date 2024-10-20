package sala;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sala {

    public int  ID, CapacidadDeAsientos;
    public int CantidadDeAsientosPremium;
    public int CantidadDeAsientosVIP;
    public String PeliculasProyecta;
    public LocalDate HorariosSala;
    public String distribucion;
    public ArrayList <Sala> listaSalas=new ArrayList<>();

    public Sala(int ID, int capacidadDeAsientos, int cantidadDeAsientosPremium, int cantidadDeAsientosVIP,
                String peliculasProyecta, LocalDate horariosSala, String Distribucion) {
        this.ID = ID;
        this.CapacidadDeAsientos = capacidadDeAsientos;
        this.CantidadDeAsientosPremium = cantidadDeAsientosPremium;
        this.CantidadDeAsientosVIP = cantidadDeAsientosVIP;
        this.PeliculasProyecta = peliculasProyecta;
        this.HorariosSala = horariosSala;
        this.distribucion = Distribucion;
    }

    public int getID() {
        return ID;
    }

    public int getCapacidadDeAsientos() {
        return CapacidadDeAsientos;
    }

    public int getCantidadDeAsientosPremium() {
        return CantidadDeAsientosPremium;
    }

    public int getCantidadDeAsientosVIP() {
        return CantidadDeAsientosVIP;
    }

    public String getPeliculasProyecta() {
        return PeliculasProyecta;
    }

    public LocalDate getHorariosSala() {
        return HorariosSala;
    }

    public String getDistribucion() {
        return distribucion;
    }
}
