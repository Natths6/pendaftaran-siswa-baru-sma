/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab3.InheritanceProject;

/**
 *
 * @author tasya
 */

// Subclass
public class SiswaBeasiswa extends SiswaBaru {
    protected String jenisBeasiswa;
    
    public SiswaBeasiswa(String nama, String alamat, String jenisKelamin, String asalSekolah, 
            String tanggalLahir, String nomorTelepon, String jurusan, String jenisBeasiswa) {
        super(nama, alamat, jenisKelamin, asalSekolah, tanggalLahir, nomorTelepon, jurusan);
        this.jenisBeasiswa = jenisBeasiswa;
    }
    
    public void cetakDataSiswaBaru() {
        super.cetakDataSiswaBaru();
        System.out.println("Jenis Beasiswa: " + jenisBeasiswa);
    }
}
