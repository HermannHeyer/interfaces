/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

public class Curriculum extends Hoja{
    
    private String nombre,especialidad;
    private ArrayList<String> experiencias;

    public Curriculum(String nombre, String especialidad, String contenido) {
        super(contenido);
        this.nombre = nombre;
        this.especialidad = especialidad;
         this.experiencias = new ArrayList<>();
      
    }
    
    public Curriculum aggegarExperiencia(String experiencia){
        experiencias.add(experiencia);
        return this;
    }
    @Override
    public String imprimir(){
        StringBuilder sb = new StringBuilder("Nombre :");
        sb.append(nombre).append("\n").append("Resumen :").append(this.contenido).append("\n").append("Especialidad :")
                .append(especialidad).append("\n").append("Experiencias: \n");
        for(String exp: this.experiencias){
            sb.append("-").append(exp).append("\n");
        }
        return sb.toString();
    }
}
