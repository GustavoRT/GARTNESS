/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gartness;

import Controlador.ControladorGartness;
import Modelo.ModeloGartness;
import Vista.VentanaPrincipal;

/**
 *
 * @author dam2
 */
public class GARTNESS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       /**
        * Creamos una nueva instancia de los objetos VentanaPrincipal
        * y del ModeloGartness para iniciar el contructor y lanzar la ventana principal
        */
       VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
       ModeloGartness modeloGartness = new ModeloGartness();
       ControladorGartness controladorGartness = new ControladorGartness(modeloGartness,ventanaPrincipal );
       
       // ventanaPrincipal.setVisible(true);
    }
    
}
