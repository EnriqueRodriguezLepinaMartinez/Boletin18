/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_18;

import javax.swing.JOptionPane;

/**
 *
 * @author ricky_000
 */
public class Boletin_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buzon listaCorreo =new Buzon();
       
        int opcion;
        
        do{ 
            opcion=Integer.parseInt(JOptionPane.showInputDialog("MENÚ \n1.Meter nuevo correo \n2.Número de correos  \n3.Correos no leidos \n4.Mostrae un email \n5.Último correo no leido \n6.Eliminar correo \n7.Salir " ));
       
            switch(opcion){
                case 1:listaCorreo.engadirCorreo();
                       break;
                case 2:listaCorreo.calcularNumCorreos();
                    break;
                case 3:listaCorreo.porLer();
                    break;
                case 4:listaCorreo.Amosa(Integer.parseInt(JOptionPane.showInputDialog("Numero de correo a leer?")));
                    
                    break;
                case 5:listaCorreo.primerNONlid();
                    break;
                case 6:listaCorreo.elimina(Integer.parseInt(JOptionPane.showInputDialog("Numero de correo a eliminar?")));
                    break;
                case 7:System.exit(0);
                    
                    
                       
            }       
        }while(opcion<7);
    
}
    
}
