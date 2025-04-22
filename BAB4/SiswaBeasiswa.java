/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4;

/**
 *
 * @author tasya
 */

// Subclass
public class SiswaBeasiswa extends SiswaBaru {
    private String jenisBeasiswa;

    public SiswaBeasiswa(String nama, String alamat, String jenisKelamin, String asalSekolah, String tanggalLahir,
                         String nomorTelepon, String jurusan, String jenisBeasiswa) {
        super(nama, alamat, jenisKelamin, asalSekolah, tanggalLahir, nomorTelepon, jurusan);
        this.jenisBeasiswa = jenisBeasiswa;
    }

    public String getJenisBeasiswa() {
        return jenisBeasiswa;
    }

    public void setJenisBeasiswa(String jenisBeasiswa) {
        this.jenisBeasiswa = jenisBeasiswa;
    }
}
