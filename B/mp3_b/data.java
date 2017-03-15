/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3_b;

/**
 *
 * @author SystemFive
 */
public class data {
    private double panjang;
    private double lebar;
    private static double luas;
    private static double keliling;
    
    public void setPanjang(double panjang)
    {
        this.panjang = panjang;
    }
    public void setLebar(double lebar)
    {
        this.lebar = lebar;
    }
    public double getKeliling()
    {
        this.keliling = (2*this.panjang) + (2*this.lebar);
        return this.keliling;
    }
    public double getluas()
    {
        this.luas = this.panjang * this.lebar;
        return this.luas;
    }
    
}
