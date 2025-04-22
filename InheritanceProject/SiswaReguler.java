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
public class SiswaReguler extends SiswaBaru {
    protected double biayaPendaftaran;

    public SiswaReguler(String nama, String alamat, String jenisKelamin, String asalSekolah, 
            String tanggalLahir, String nomorTelepon, String jurusan, double biayaPendaftaran) {
        super(nama, alamat, jenisKelamin, asalSekolah, tanggalLahir, nomorTelepon, jurusan);
        this.biayaPendaftaran = biayaPendaftaran;
    }
    public void cetakDataSiswaBaru() {
        super.cetakDataSiswaBaru();
        System.out.println("Biaya Pendaftaran: " + biayaPendaftaran);
    }
}
