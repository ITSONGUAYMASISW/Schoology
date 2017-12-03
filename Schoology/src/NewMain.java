
import mx.itson.schoology.negocio.Metodos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CCarballo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos mt = new Metodos();
        for (int i = 0; i < 5; i++) {
            System.out.println(mt.GenerarCodigo());
        }

    }
    
}
