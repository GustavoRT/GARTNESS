/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloGartness;
import Vista.VentanaPrincipal;

/**
 *
 * @author dam2
 */
public class ControladorGartness {
    
    /***
     * Declaramos los atriubutos del contronlador que van a ser necesarios 
     * para lanzar la ventana principal
     */
    private ModeloGartness modeloGartness;
    private VentanaPrincipal ventanaPrincipal;

    /***
     * Parametros que estaran contenidos en el constructor de la clase controladora
     * @param modeloGartness
     * @param ventanaPrincipal 
     */
    public ControladorGartness(ModeloGartness modeloGartness, VentanaPrincipal ventanaPrincipal) {
        this.modeloGartness = modeloGartness;
        this.ventanaPrincipal = ventanaPrincipal;
        ventanaPrincipal.setVisible(true);
    }

    
    
    
    
}
