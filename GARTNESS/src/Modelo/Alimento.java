/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.io.Serializable;

/**
 *
 * @author GART
 */
public class Alimento implements Serializable{
    
    private String nombre;
    private double gramos;
    private double kiloCalorias;
    private String descripcion;

    public Alimento(){
        
    }

    public Alimento(String nombre, double gramos, double kiloCalorias, String descripcion) {
        this.nombre = nombre;
        this.gramos = gramos;
        this.kiloCalorias = kiloCalorias;
        this.descripcion = descripcion;
    }

    /**
     * Metodo accesor para el atributo de la clase alimento
     * @return una cadena con el nombre del alimento
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo accesor para el atributo de la clase alimento
     * @param nombre del alimento que entra como parametro
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo accesor para el atributo de la clase alimento
     * @return los gramos de peso de el alimento en cuestion
     */
    public double getGramos() {
        return gramos;
    }

    /**
     * Metodo accesor para el atributo de la clase alimento
     * @param gramos que se encarga de modificar el peso en gramos del alimento
     */
    public void setGramos(double gramos) {
        this.gramos = gramos;
    }

    /**
     * Metodo accesor para el atributo de la clase alimento
     * @return las kilocalorias que tiene el alimento por cada 100gr
     */
    public double getKiloCalorias() {
        return kiloCalorias;
    }

    /**
     * Metodo accesor para el atributo de la clase alimento
     * @param kiloCalorias que se pueden modificar del alimento en cuestion
     */
    public void setKiloCalorias(double kiloCalorias) {
        this.kiloCalorias = kiloCalorias;
    }

    /**
     * Metodo accesor para el atributo de la clase alimento
     * @return un string con la descripcion del alimento en cuestion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Metodo accesor para el atributo de la clase alimento
     * @param descripcion que sirve para modificar la descripcion del alimento
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Metodo accesor para el atributo de la clase alimento
     * @return un string con la presentacion en la que se imrpime el alimento
     */
    @Override
    public String toString() {
        return "NOMBRE: " + nombre + "\nGRAMOS: " + gramos + "\nKILOCALORIAS: " + kiloCalorias + "\nDESCRIPCION: " + descripcion+"\n";
    }
  
    
}
