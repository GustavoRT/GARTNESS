/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Alimento;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author GART
 */
public class ControladorCargarAlimento {
    
   
    
    /**
     * Metodo que se encarga de cargar los datos (Alimentos) desde una
     * base de datos que en este caso es un archivo con extension csv
     * @param archivo que contiene la informacion que se va a cargar
     */
  public  List<Alimento> cargarAlimentos(String ruta) {
           List<Alimento> alimentos = new ArrayList<>();
        String linea;
        
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            // Omitir la primera línea (encabezados)
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] valores = linea.split(";");
                
                if(valores.length == 3){
                    String nombre = valores[0];
                int calorias = Integer.parseInt( valores[1]);
                String descripcion =  valores[2];
               Alimento alimento = new Alimento(nombre,100, calorias, descripcion);
                alimentos.add(alimento);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return alimentos;
    }

    
}
