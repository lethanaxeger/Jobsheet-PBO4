/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan_Polymorphism;

/**
 *
 * @author WINDOWS 10
 */
public class Staf extends Pegawai {
    private static final int gajiStaf=50000;
    private static final int bonusStaf=10000;
    
    public int gaji(){
        return gajiStaf;
    }
    public int Bonus(){
        return bonusStaf;
    }
}
