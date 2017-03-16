/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3_a;

import java.util.Scanner;

/**
 *
 * @author SystemFive
 */
public class Mp3_a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int status = 0;
       data data_banding = new data();
       Scanner data = new Scanner(System.in);
       do {
           System.out.print("Bil1 :");
           data_banding.bil1 = data.nextInt();
       }while(data_banding.bil1 > data_banding.max || data_banding.bil1 < data_banding.min);
       do {
           System.out.print("Bil2 :");
           data_banding.bil2 = data.nextInt();
       }while(data_banding.bil2 > data_banding.max || data_banding.bil2 < data_banding.min);
       System.out.println(data_banding.getBanding());
       
       
    }
    
}
