/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Vista.VentanaPrincipal;
import Vista.VentanaSimulacionCarga;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author GART
 */
public class ControladorVentana {
    
    private VentanaSimulacionCarga ventanaSimulacionCarga;
    private VentanaPrincipal ventanaPrincipal;
    private ControladorEventosVentanaPrincipal controladorEventosVentanaPrincipal;
    
    
    /**
     * Constructor de la calse controladora, esta constructor se encanrga de 
     * parametrizar las ventanas de la app, dandole parametros como dimensiones y nombres de titulos
     * @param ventanaSimulacionCarga es la ventana que simula la carga del inicio de la app
     * @param ventanaPrincipal es la ventana donde tenemos toda la botonera con sus funcionalidades
     */
    public ControladorVentana(VentanaSimulacionCarga ventanaSimulacionCarga, VentanaPrincipal ventanaPrincipal,ControladorEventosVentanaPrincipal controladorEventosVentanaPrincipal){
        this.ventanaSimulacionCarga = ventanaSimulacionCarga;
        this.ventanaPrincipal = ventanaPrincipal;
        this.controladorEventosVentanaPrincipal = controladorEventosVentanaPrincipal;
        
        System.out.println("Iniciando...");
        ImageIcon gifIcon = new ImageIcon("src/recursos/Imagen_carga.gif");
        ventanaSimulacionCarga.getJLabelIcono(gifIcon);
        ventanaSimulacionCarga.setTitle("Cargando...");
        ventanaSimulacionCarga.setSize(420, 340);
        ventanaSimulacionCarga.setResizable(false);
       
       
        ImageIcon gifIconInicio = new ImageIcon("src/recursos/Logo_gartness22.png");
        ventanaPrincipal.getJLabelIcono(gifIconInicio);
        ventanaPrincipal.setTitle("GARTNESS");
        ventanaPrincipal.setSize(500, 580);
        ventanaPrincipal.setResizable(false);
    }
    
    /**
     * Metodo que lanza la ventana de carga,
     * Este metodo se encarga de lanzar la ventana y despues de unos segundos
     * se cierra para que se abra la ventana principal de la aplicacion
     */
    public void lanzarVentanaCarga(){
        ventanaSimulacionCarga.setVisible(true);
        Timer timer = new Timer();
        
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                ventanaSimulacionCarga.dispose(); // Cierra la ventana
                System.out.println("La ventana de carga ha desaparecido...");
                ventanaPrincipal.setVisible(true);
                 System.out.println("Lanzando ventana principal...");
            }
        }, 3000); // Tiempo en milisegundos (5 segundos)
      
    }
    
 
    
    
}
