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
public class data {
   static final int max = 5;
   static final int hargaBakso = 10000;
   static int a;
   public static int hitung()
   {
       if(a <= max)
       {
           return a*hargaBakso;
       }else{
           return 0;
       }
   }
    
}
