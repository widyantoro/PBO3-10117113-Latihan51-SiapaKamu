/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg1011713.latihan52.siapakamu;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk menampilkan biodata sederhana.
 *            
 */
public class Manusia {
    protected String nama;
    protected int Umur;


    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setUmur(int Umur) {
        this.Umur = Umur;
    }

    public int getUmur() {
        return Umur;
    }
    
     public void siapaKamu(){
        System.out.println("Saya Manusia");
     }
}
