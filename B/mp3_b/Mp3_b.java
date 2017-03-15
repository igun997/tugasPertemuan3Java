/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3_b;

import java.util.Scanner;

/**
 *
 * @author SystemFive
 */
public class Mp3_b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input_data = new Scanner(System.in);
       data data_persegi = new data();
       System.out.print("setPanjang :");
       data_persegi.setPanjang(input_data.nextDouble());
       System.out.print("setLebar :");
       data_persegi.setLebar(input_data.nextDouble());
       System.out.printf("Luas Persegi Panjang : %.2f \n",data_persegi.getluas());
       System.out.printf("Keliling Persegi Panjang : %.2f",data_persegi.getKeliling());
    }
    
}
