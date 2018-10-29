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
public class Dosen extends Manusia{
    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Saya "+nama+" umur "+Umur+" sedang "
                 + " mengajar matakuliah "+mataKuliah);
    }
    
    @Override
    public void siapaKamu(){
         System.out.println("Saya Dosen");
    }
}
