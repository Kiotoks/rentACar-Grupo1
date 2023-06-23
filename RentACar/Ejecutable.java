/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.grupal;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Auto auto1 = new Auto("45567","palio", "gris", "fiat", 123124);
        Auto auto2 = new Auto("34567","clio", "rojo", "renault", 10234);
        Auto auto3 = new Auto("12456","Prisma", "gris", "chevrolet", 30334);
        
        Cliente cliente1 = new Cliente( 1, "Roberto", "46789000", "San Martin", "011345678");
        Cliente cliente2 = new Cliente( 2, "Juan", "54678123", "Pilar", "0112145678");  
        
        Reserva reserva1 = new Reserva ( cliente1, LocalDate.of(2023,7,21);
        Reserva reserva2 = new Reserva ( cliente2, 10);
        
        reserva1.agregarAuto(auto1);
        reserva2.agregarAuto(auto2);
        reserva2.agregarAuto(auto3); 
        
       reserva1.imprimirTicket();
       reserva2.imprimirTicket();
    }
    
}
