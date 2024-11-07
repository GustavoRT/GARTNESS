/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloVentanaPrincipal;
import Vista.VentanaPrincipal;
import java.awt.Dimension;
import javax.swing.ImageIcon;

/**
 *
 * @author dam2
 */
public class ControladorVentanaPrincipal {
    
    /***
     * Declaramos los atriubutos del contronlador que van a ser necesarios 
     * para lanzar la ventana principal
     */
    private ModeloVentanaPrincipal modeloGartness;
    private VentanaPrincipal ventanaPrincipal;

    /***
     * Parametros que estaran contenidos en el constructor de la clase controladora
     * @param modeloGartness
     * @param ventanaPrincipal 
     */
    public ControladorVentanaPrincipal(ModeloVentanaPrincipal modeloGartness, VentanaPrincipal ventanaPrincipal) {
        this.modeloGartness = modeloGartness;
        this.ventanaPrincipal = ventanaPrincipal;
        ImageIcon  icon = new ImageIcon ("src\\Recursos\\1.jpg");
        ventanaPrincipal.getLabelImagen(icon);
      //  ventanaPrincipal.resize(238,538);
       // ventanaPrincipal.getLabelDimension(new Dimension(200,100));
        ventanaPrincipal.setVisible(true);
    }

    
    
    
    
}
