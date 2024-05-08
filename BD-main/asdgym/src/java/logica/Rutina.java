/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author yerky vargas
 */
public class Rutina {
    
    List<String> rutina;

        public void crearRutina() {
        
      this.rutina=null;
        
        }
        
     public void mostrarRutina(List<String> rutina) {
        Collections.shuffle(rutina);
       
        int contador = 0;
        for (String elemento : rutina) {
            System.out.print(elemento + " ");
            contador++;
            
            if (contador % 5 == 0) {
                System.out.println();
            }
        }
    }

    public List<String> getRutina() {
        return rutina;
    }

    public void setRutina(List<String> rutina) {
        this.rutina = rutina;
    }
}


