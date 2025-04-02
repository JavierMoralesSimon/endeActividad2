/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deposito;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usutarde
 */
public class Deposito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CCuenta miCuenta;
        double saldoActual;
        
        miCuenta=new CCuenta("Antonio López", "1000-2365-85-1230456789", 3600, 0);
        saldoActual=miCuenta.estado();
        System.out.println("El saldo actual es "+saldoActual);
        
        try {
            System.out.println("Retirada en cuenta");
            miCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }
        
        try {
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }
    }
    
}
