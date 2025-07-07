/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imprenta;
import modelo.Curriculum;
import modelo.Hoja;
import modelo.Informe;
/**
 *
 * @author fox
 */
public class EjemploImprenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Curriculum cv = new Curriculum("Hermann Heyer", "Programación","El mejor CV del Mundo");
       cv.aggegarExperiencia("Java");
       cv.aggegarExperiencia("PHP");
       cv.aggegarExperiencia("Bootstrap");
       
       Informe informe = new Informe("Rosa Sáez", "Informe de Ing. Civil Industrial");
       imprimir(cv);
        imprimir(informe);
    }
    
    public static void imprimir (Hoja imprible){
        System.out.println(imprible.imprimir());
    }
}
