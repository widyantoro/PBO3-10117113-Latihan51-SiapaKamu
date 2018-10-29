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
public class PBO31011713Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        System.out.println("NIP Dosen : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        dosen.mengajarApa();
        
        System.out.println(" ");
    Mahasiswa mhs = new Mahasiswa();
        mhs.setNim("10110269");
        System.out.println("NIM Mahasiswa : "+mhs.getNim());
        mhs.siapaKamu();
        mhs.setNama("Nindi");
        mhs.setUmur(17);
        mhs.setKelas("PBO");
        mhs.kelasApa();
    }
    
}
