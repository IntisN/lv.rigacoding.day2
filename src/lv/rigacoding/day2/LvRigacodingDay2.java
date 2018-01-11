/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day2;

/**
 *
 * @author IntisN
 */
public class LvRigacodingDay2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. variants
        //Automasina automasina1 = new Automasina();
        //2. variants
        Transportlidzeklis automasina = new Automasina();
        //Nepareizi
        //Transportlidzeklis auto3 = new Transportlidzeklis();
        
        Transportlidzeklis lidmasina = new Lidmasina();
        Transportlidzeklis vilciens = new Vilciens();
        
        automasina.Parvietoties();
        lidmasina.Parvietoties();
        vilciens.Parvietoties();
    }
    
}
