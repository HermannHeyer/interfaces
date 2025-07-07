/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author fox
 */
public class Informe extends Hoja {

    private String autor;

    public Informe(String autor, String contenido) {
        super(contenido);
        this.autor = autor;
    }
    
  
    
    @Override
    public String imprimir(){
        return "Informe Escrito Por :"+autor+"\n"+this.contenido;
    }
    
    
}
