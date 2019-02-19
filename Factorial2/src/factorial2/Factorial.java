/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial2;

/**
 *
 * @author Enmanuel
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        factor Factor = new factor();
        
        System.out.println("El Factorial de 3 es: " + Factor.factori(3));
        System.out.println("El Factorial de 4 es: " + Factor.factori(4));
        System.out.println("El Factorial de 100 es: " + Factor.factori(99));
        System.out.println("El Factorial de 0 es: " + Factor.factori(0));
        
        
    }
    
}
