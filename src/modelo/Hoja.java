/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author fox
 */
abstract public class Hoja {
    
    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }
    
    abstract public String imprimir();
}
