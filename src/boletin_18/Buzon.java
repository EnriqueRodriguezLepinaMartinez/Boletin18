/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_18;

/**
 *
 * @author ricky_000
 */
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;


public class Buzon {
    private ArrayList <Correo>Buzon;

    
    
    public Buzon (){
        Buzon = new ArrayList <Correo>(); 
    }
    
    public String meterMensaxe(){
        String mensaxe=JOptionPane.showInputDialog("Escribe un mensaje para enviar: ");
        return mensaxe;
    }
    public void engadirCorreo(){
        Correo c=new Correo();
        
        c.setMensaxe(meterMensaxe());
        Buzon.add(c);
    }
    public void calcularNumCorreos(){
      System.out.println("Correos totales " + Buzon.size());
    }
    public void porLer(){
        Correo mail=new Correo();
        int contar=0;
       for(int i=0;i<Buzon.size();i++){
           mail=Buzon.get(i);
           if(mail.isLido()==false)
               contar++;
       }
        System.out.println("Correos por leer: "+contar);
    }
    
    public void Amosa(int k){//Amosa o último correo lido 
        Correo mail=new Correo();
        mail=Buzon.get(k);
        mail.setLido(true);
        System.out.println("Correo elegido: " +mail.getMensaxe()); 
    }
    
    
    
    
    
    public void primerNONlid(){
        Correo mail=new Correo();
        int i=Buzon.size();
       
        do{
            
            i--;
            mail=Buzon.get(i);
            
        }while(mail.isLido()==true || i==0);
        if(i>=0){
        
        System.out.println("Primer correo no leido: " + mail.getMensaxe());
        mail.setLido(true);
        }
        else
            System.out.println("No hay mensajes que mostrar");
        
          
}
    public void elimina(int k){
        Buzon.remove(k);
        System.out.println("Correo "+ k +" eliminado");
    }
}
