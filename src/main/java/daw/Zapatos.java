/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author edu
 */
public class Zapatos {

    // Atributos encapsulados
    private String color;
    private double talla;

    // Contructor 
    public Zapatos(String color, double talla) {
        this.color = color;
        this.talla = talla;
    }

    public Zapatos() {
    }

    // Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    // ToString 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Color zapatos = ").append(color);
        sb.append(", Talla zapatos = ").append(talla);
        return sb.toString();
    }

}
