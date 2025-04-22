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
public class SiswaReguler extends SiswaBaru {
    private double biayaPendaftaran;

    public SiswaReguler(String nama, String alamat, String jenisKelamin, String asalSekolah, String tanggalLahir,
                        String nomorTelepon, String jurusan, double biayaPendaftaran) {
        super(nama, alamat, jenisKelamin, asalSekolah, tanggalLahir, nomorTelepon, jurusan);
        this.biayaPendaftaran = biayaPendaftaran;
    }

    public double getBiayaPendaftaran() {
        return biayaPendaftaran;
    }

    public void setBiayaPendaftaran(double biayaPendaftaran) {
        this.biayaPendaftaran = biayaPendaftaran;
    }
}
