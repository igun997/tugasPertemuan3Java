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
public class data {
    public static final int max = 100;
    public static final int min = 0;
    static int bil1;
    static int bil2;
    public static String getBanding()
    {
        int status = 0;
        if(bil1 < bil2)
        {
            status = 1;
        }else if(bil1 > bil2){
            status = 2;
        }else if(bil1 == bil2){
            status = 3;
        }
        if(status == 1){
             return "Bil2 lebih Kecil dari pada Bil1";
        }else if(status == 2)
        {
            return "Bil1 lebih besar dari pada Bil2";
        }else{
            return "Bil1 dan Bil2 Sama Besar";
        }
    }
}
