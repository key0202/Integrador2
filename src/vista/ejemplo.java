/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Mikeyla
 */
public class ejemplo {
    String apellidos;
    
    String id;
    String nombre="colombianita";
    int edad=15;
    Boolean bica=true;
    
    public String SuperColombianita(){
        String mensaje;
        return mensaje="Sube tu cambio pues oe";
    }
    
    public double moneda(){
        return  31;
    }
    
    public void saltando(){
        JOptionPane.showMessageDialog(null, edad);
    }
        
    public String abel(){
        String a="";
        JOptionPane.showMessageDialog(null, edad);
        return a;
    }
    
    public static void main(String[] args) {
        System.out.println("Hola munda mala");
    }
    
    /**comentario de david**/
    public void dormir(String cansado){
        System.out.println("Situacion actual: " + cansado);
    }
}
