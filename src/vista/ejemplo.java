/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Mikeyla
 */
public class ejemplo {
    
    String id;
    String nombre="colombianita";
    int edad=15;
    
    public void saltando(){
        JOptionPane.showMessageDialog(null, edad);
    }
    
    public static void main(String[] args) {
        System.out.println("Hola munda");
    }
}
