/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gartness;

import Controlador.ControladorAjustesVentana;
import Controlador.ControladorCargarAlimento;
import Controlador.ControladorEventosVentanaPrincipal;
import Controlador.ControladorVentana;
import Modelo.Alimento;
import Vista.VentanaAjuste;
import Vista.VentanaPrincipal;
import Vista.VentanaSimulacionCarga;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author dam2
 */
public class GARTNESS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Cargamos los alimentos desde la base de datos en tiempo de ejecucion y son mostrados por pantalla
        ControladorCargarAlimento controladorCargarAlimento = new ControladorCargarAlimento();
          List<Alimento> alimentos = controladorCargarAlimento.cargarAlimentos("src\\BDD\\alimentos_fitness.csv");
         for (Alimento alimento : alimentos) {
            System.out.println(alimento);
        }
     
       /**
        * Creamos una nueva instancia de los objetos VentanaPrincipal
        * y del ModeloGartness para iniciar el contructor y lanzar la ventana principal
        */
     
       VentanaSimulacionCarga ventanaSimulacionCarga = new VentanaSimulacionCarga();
       VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
      
       
       ControladorEventosVentanaPrincipal controladorEventosVentanaPrincipal = new  ControladorEventosVentanaPrincipal(ventanaPrincipal);
       ControladorVentana controladorVentana = new ControladorVentana(ventanaSimulacionCarga,ventanaPrincipal,controladorEventosVentanaPrincipal);
       
       ControladorAjustesVentana controladorAjustesVentana = new ControladorAjustesVentana(ventanaPrincipal);
       controladorVentana.lanzarVentanaCarga();


       
    }
    
}
