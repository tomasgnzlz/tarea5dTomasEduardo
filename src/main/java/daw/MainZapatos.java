/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author edu
 */
public class MainZapatos {
    public static void main(String[] args) {
        
        // Constructor sin parametros;
        Zapatos z1 = new Zapatos();
        
        // Objetos con contructor parametrizados
        Zapatos z2 = new Zapatos("Rojo", 30);
        Zapatos z3 = new Zapatos("Verde", 44.5);
        Zapatos z4 = new Zapatos("Blanco", 48);
        // Muestro los zapatos
        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);
        System.out.println(z4);
        // probado
    }
}
