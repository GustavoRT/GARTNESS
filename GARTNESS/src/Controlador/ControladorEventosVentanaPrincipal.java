/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Vista.VentanaAjuste;
import Vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author GART
 */
public class ControladorEventosVentanaPrincipal  implements ActionListener{
    
    private VentanaPrincipal ventanaPrincipal;
    private VentanaAjuste ventanaAjuste;
    
        public ControladorEventosVentanaPrincipal( VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
   
        asociarListenersEscuchadores(this);
        
    }
        
        /**
         * Metodo que asocia a cada componente de la ventana principal
         * el escuchardor para efectuar la accion
         * @param listener es el escuchador que entra como parametro
         */
     public void asociarListenersEscuchadores (ActionListener listener){
        ventanaPrincipal.ClickBtnAjustes(this);
        ventanaPrincipal.ClickBtnCalendario(this);
        ventanaPrincipal.ClickBtnComunidad(this);
        ventanaPrincipal.ClickBtnDispositivos(this);
        ventanaPrincipal.ClickBtnEntrenamiento(this);
        ventanaPrincipal.ClickBtnMiPerfil(this);
        ventanaPrincipal.ClickBtnNutricion(this);
        ventanaPrincipal.ClickBtnProgreso(this);
        ventanaPrincipal.ClickBtnReserva(this);
    }
        
        @Override
    public void actionPerformed(ActionEvent e){
          System.out.print("Pinchaste -> ");  
          System.out.println( e.getActionCommand() );


        switch (e.getActionCommand()){
        case "Nuevo":
            System.out.println("Has elegido Nuevo");
        break;
        case "Salir":
            System.out.println("Has elegido Salir");
            break;
        case "Copiar":
            System.out.println("Has elegido Copiar");
            break;
        case "Cortar":
            System.out.println("Has elegido Cortar");
            break;
        case "Pegar":
            System.out.println("Has elegido Pegar");
            break;
        case "Imprimir":
            System.out.println("Has elegido imprimir");
            break;
        default :
        break;
        }
    }
    
}
