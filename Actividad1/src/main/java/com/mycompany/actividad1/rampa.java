
package com.mycompany.actividad1;

/**
 *
 * @author Fcarrera
 */
public class rampa {
     public static void main(String[] args) {
        final float pendiente = 7;//en grados
        final int escalones = 2;
        double alturaEscalones = 13;//en centímetros
        double longuitud;
        longuitud = (((alturaEscalones*escalones)/pendiente)*100)/100;
        System.out.println("La longuitud de la rampa es: "+((double)Math.round(longuitud * 100d) / 100d)+ " mts");
        
        
         
    } 
}
