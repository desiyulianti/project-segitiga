/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga;

/**
 *
 * @author MOKLET-2
 */
public class Segitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        luas ku = new luas();
        ku.input();
        ku.hitung();

        System.out.println(ku.hasil());
    }
}
    

