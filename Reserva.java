/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.grupal;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reserva {
    private double codRe;
    private Cliente cli;
    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private int dias;
    private double precio;
    ArrayList<Auto> autos;

    public Reserva(double codRe, Cliente cli, LocalDate fechaFin) {
        this.codRe = codRe;
        this.cli = cli;
        this.fechaFin = fechaFin;
    }

    public Reserva(double codRe, Cliente cli, int dias) {
        this.codRe = codRe;
        this.cli = cli;
        this.dias = dias;
    }

    public double getCodRe() {
        return codRe;
    }

    public void setCodRe(double codRe) {
        this.codRe = codRe;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Auto> getAutos() {
        return autos;
    }

    public void addAutos(Auto a) {
       this.autos.add(a);
    }
    
    
}

