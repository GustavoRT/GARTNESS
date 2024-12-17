/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaAjuste;
import Vista.VentanaAjuste;
import Vista.VentanaPrincipal;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

/**
 *
 * @author GART
 */
public class ControladorAjustesVentana implements ActionListener {

    private VentanaAjuste ventanaAjuste;
    private VentanaPrincipal ventanaPrincipal;

    public ControladorAjustesVentana(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;

        ventanaAjuste = new VentanaAjuste();
        ventanaAjuste.setTitle("Configurando...");
        ventanaAjuste.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        iniciaEscuchadores();
    }

    /**
     * Metodo que se encarga de controlar los escuhadores
     * de los componentes de las ventanas
     */
    public void iniciaEscuchadores() {
        ventanaPrincipal.getBotonAjustes(this);
        ventanaAjuste.clicBtnOk(this);
        ventanaAjuste.clicBtnColorFondo(this);
        ventanaAjuste.clicBtnCancel(this);
        ventanaAjuste.clicBtnColorFondoBotones(this);
    }

    /**
     * Metodo que captura el componente accionado, clasificacndo las funciones
     * en un switch case que actuaran dependiendo del boton que se pinche
     * @param e el evento que esta escuchando
     */
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "COLOR FONDO":
                lanzaColorFondo();
                break;
            case "COLOR BOTONES":
                lanzaColorFondoBotones();
                break;
            case "OK":
                lanzaOk();
                break;
            case "CANCEL":
                lanzaCancel();
                break;
            case "Ajustes":
                lanzarVentanaAjustes();
                break;
            default:
                System.out.println("Se ha pulsado algo ???");
        }
    }

    /**
     * Metodo que no recibe parametros y se encarga de
     * que la ventana de ajustes se haga visible y que no se 
     * pueda redimensionar.
     */
    public void lanzarVentanaAjustes() {
        ventanaAjuste.setResizable(false);
        ventanaAjuste.setVisible(true);
    }

    /**
     *Metodo sin parametros que se encarga de efectuar los cambios 
     * en la ventana principal desde la ventana de ajustes
     */
    public void lanzaOk() {
        System.out.println("Ok");
        if (!ventanaAjuste.getTextoFieldTitulo().isEmpty()) {
            ventanaPrincipal.setTitle(ventanaAjuste.getTextoFieldTitulo());
            System.out.println("Nuevo título: " + ventanaAjuste.getTextoFieldTitulo() + ".");
        } else {
            ventanaPrincipal.setTitle("GARTNESS");
        }
        ventanaAjuste.dispose();
    }

    /**
     * Metodo que se encarga de cambiar y hacer efectivo el
     * cambio de color del fonto de la aplicacion, en este caso del panel
     */
    public void lanzaColorFondo() {

        JColorChooser colorOptar = new JColorChooser();
        int resultado = JOptionPane.showConfirmDialog(null, colorOptar, "Selecciona un color", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (resultado == JOptionPane.OK_OPTION) {
            System.out.println("El color seleccionado es " + colorOptar.getColor().toString());
            ventanaPrincipal.ponColorjPanelCentral(colorOptar.getColor());
        } else {
            System.out.println("No se seleccionó ningún color.");
        }

    }

    /**
     * Metodo que se encarga de cambiar y hacer efectivo el
     * cambio de color de los botones de la ventana proncipal
     */
    public void lanzaColorFondoBotones() {

        JColorChooser colorOptar = new JColorChooser();
        int resultado = JOptionPane.showConfirmDialog(null, colorOptar, "Selecciona un color", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (resultado == JOptionPane.OK_OPTION) {
            System.out.println("El color seleccionado es " + colorOptar.getColor().toString());
            ventanaPrincipal.ponColorjBotones(colorOptar.getColor());
        } else {
            System.out.println("No se seleccionó ningún color.");
        }

    }

    /**
     * Metodo que cancela los cambio que se le hicieron a la ventana principal
     * desde la ventana de ajustes
     */
    public void lanzaCancel() {
        System.out.println("Cancel");
        ventanaPrincipal.ponColorjPanelCentral(Color.BLACK);
        ventanaPrincipal.ponColorjBotones(new Color(237, 243, 248));
        ventanaAjuste.dispose();
    }

}
