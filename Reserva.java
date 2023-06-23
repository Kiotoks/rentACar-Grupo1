/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.grupal;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Reserva {
    private static int  codRe = 100;
    private int numero_factura;
    private Cliente cli;
    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private int dias;
    private double precio;
    ArrayList<Auto> autos;

    public Reserva(Cliente cli, LocalDate fechaFin) {
        this.numero_factura = Reserva.codRe++;
        this.cli = cli;
        this.fechaFin = fechaFin;
        this.fechaIni = LocalDate.now();
        this.dias = calcularDias();
    }

    public Reserva(Cliente cli, int dias) {
         this.numero_factura = Reserva.codRe++;
        this.cli = cli;
        this.dias = dias;
        this.fechaIni = LocalDate.now();
        calcularFecha();
    }

    public double getCodRe() {
        return codRe;
    }

    public Cliente getCli() {
        return cli;
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

    public void agregarAuto(Auto a) {
       this.autos.add(a);
    }
    
    public void calcularFecha(){
        fechaFin = fechaIni.plusDays(dias);
    }
    public int calcularDias(){
        Period periodo = Period.between(fechaIni, fechaFin);
        return periodo.getDays();
    }
    public int calcularPrecio(int d, int p) {
  
        return d * p;
    }
    
    public void imprimirTicket(){
    String text = "";
    text += "Numero de factura: " + this.numero_factura;
    text += "Fecha de inicio: " + this.fechaIni;
    text += "Fecha final: " + this.fechaFin;
    for(Auto a: autos){
        text += a.toString();
        
    }
    text += "Cliente: " + cli.toString();
    
    }
    
}

