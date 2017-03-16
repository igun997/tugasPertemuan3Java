/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author SystemFive
 */
public class Pertemuan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        data hitung = new data();
        for(int a=1; a <= hitung.max; a++)
        {
            hitung.a = a;
            System.out.print("Harga Bakso "+hitung.a+" Porsi= "+hitung.hitung()+"\n");
        }
        
    }
    
}
