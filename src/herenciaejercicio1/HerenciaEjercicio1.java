/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaejercicio1;

import Servicios.Animal;

/**
 *
 * @author Usuario
 */
public class HerenciaEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal perro = new Perro("Stich", "Carnivoro",3 ,"Doberman");
        System.out.println("El perro "+ perro.getNombre());
        System.out.println("Es");
       perro.alimentarse();
        
       Animal gato = new Gato("Felix", "Galletas", 3, "Michi");
        gato.alimentarse();
        
        Animal Caballo = new Caballo("Pepe", "Maiz", 32, "PuraSangre");
        Caballo.alimentarse();
        
        
    }
    
}
