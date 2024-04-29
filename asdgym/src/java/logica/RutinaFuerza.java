/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Arrays;


/**
 *
 * @author yerky vargas
 */
public class RutinaFuerza extends Rutina{
    
     @Override
     public void crearRutina() {
        this.rutina=Arrays.asList("Press militar 3X10",
                "Remo con barra 4X8",
                "Curl de bíceps 3X12",
                "Fondos en paralelas 3X10",
                "Elevaciones laterales 3X12");
    }

}
