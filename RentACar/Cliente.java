/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.grupal;


public class Cliente {
   private double codCli;
   private String nombre;
   private String dni;
   private String direccion;
   private String telefono;

    public Cliente(double codCli, String nombre, String dni, String direccion, String telefono) {
        this.codCli = codCli;
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String toString() {
        return "Codigo" + codCli + "\n nombre: " + nombre + "\n dni: " + dni + "\n direccion: " + direccion + "\n telefono: " + telefono;
    }

    public double getCodCli() {
        return codCli;
    }

    public void setCodCli(double codCli) {
        this.codCli = codCli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
   
   
}
