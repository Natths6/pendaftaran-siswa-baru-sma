/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5;

/**
 *
 * @author tasya
 */
//subclass
public class SiswaBeasiswa5 extends SiswaBaru5 {
    private String jenisBeasiswa;

    // Constructor lengkap & overload
    public SiswaBeasiswa5(String nama, String alamat, String jenisKelamin, String asalSekolah,
                          String tanggalLahir, String nomorTelepon, String jurusan, String jenisBeasiswa) {
        super(nama, alamat, jenisKelamin, asalSekolah, tanggalLahir, nomorTelepon, jurusan);
        this.jenisBeasiswa = jenisBeasiswa;
    }

    public SiswaBeasiswa5(String nama, String jurusan, String jenisBeasiswa) {
        super(nama, jurusan);
        this.jenisBeasiswa = jenisBeasiswa;
    }

    // Getter & Setter
    public String getJenisBeasiswa() { return jenisBeasiswa; }
    public void setJenisBeasiswa(String beasiswa) { this.jenisBeasiswa = beasiswa; }

    // Override & Overload
    @Override
    public void cetakDataSiswaBaru() {
        super.cetakDataSiswaBaru();
        System.out.println("Jenis Beasiswa: " + jenisBeasiswa);
    }

    public void cetakDataSiswaBaru(boolean singkat) {
        System.out.println(singkat ?
            "Nama: " + nama + ", Jurusan: " + jurusan + ", Beasiswa: " + jenisBeasiswa :
            "");
        if (!singkat) cetakDataSiswaBaru();
    }
}
