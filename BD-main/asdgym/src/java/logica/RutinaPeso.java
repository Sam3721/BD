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
public class RutinaPeso extends Rutina{
    
     @Override
     public void crearRutina() {
       
        this.rutina=Arrays.asList("Burpees 3X10",
        "Cinta de correr 15 minutos",
        "Bicleta 30 minutos",
        "Peso muerto 3X10",
        "Flexiones 3X12");
    }
     
}
