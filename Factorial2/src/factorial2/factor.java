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
public class factor {

    public factor() {
    }
    
    
    public double factori(double val){
        double resultado=1;
        
        if(val==0){
            resultado=1;
        }
        else{
            for(int i =1; i<val ; i++){
            resultado += resultado*i;
            }
        }
        
        
        return resultado;
    }
    
    
    
    
}
