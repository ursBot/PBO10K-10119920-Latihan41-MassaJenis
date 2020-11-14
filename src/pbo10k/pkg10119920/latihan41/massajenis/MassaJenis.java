/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan41.massajenis;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

class Kubus {
    
    private int sisi;
    private int massa;
    
    public int getSisi() {
        return sisi;
    }
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    
    public int getMassa() {
        return massa;
    }
    public void setMassa(int massa){
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi){
        int volume;
        volume = parSisi * parSisi * parSisi;
        return volume;
    }
    public int hitungMassaJenis(int parMassa, int volume){
        int massaJenis;
        massaJenis = parMassa / volume;
        
        return massaJenis;
    }
    
}

public class MassaJenis {
    
    public static void main(String[] args) {
        
        Kubus sisiKubus = new Kubus();
        Kubus massaKubus = new Kubus();
        Kubus volumeKubus = new Kubus();
        Kubus massaJenisKubus = new Kubus();
        sisiKubus.setSisi(5);
        massaKubus.setMassa(250);
        System.out.println("=====Massa Jenis Kubus=====");
        System.out.println("Sisi : " + sisiKubus.getSisi());
        System.out.println("Massa : " + massaKubus.getMassa());
        System.out.println();
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("Volume : " + volumeKubus.hitungVolume(sisiKubus.getSisi()));
        System.out.println("Massa Jenis : " + massaJenisKubus.hitungMassaJenis(massaKubus.getMassa(), volumeKubus.hitungVolume(sisiKubus.getSisi())));
    }
}