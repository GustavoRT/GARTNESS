/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author GART
 */
public class Alimento {
    
    private String nombre;
    private double gramos;
    private double kiloCalorias;

    public Alimento(){
        
    }
    public Alimento(String nombre, double gramos, double kiloCalorias) {
        this.nombre = nombre;
        this.gramos = gramos;
        this.kiloCalorias = kiloCalorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getGramos() {
        return gramos;
    }

    public void setGramos(double gramos) {
        this.gramos = gramos;
    }

    public double getKiloCalorias() {
        return kiloCalorias;
    }

    public void setKiloCalorias(double kiloCalorias) {
        this.kiloCalorias = kiloCalorias;
    }

    @Override
    public String toString() {
        return "ModeloAlimento{" + "nombre=" + nombre + ", gramos=" + gramos + ", kiloCalorias=" + kiloCalorias + '}';
    }
    
}
