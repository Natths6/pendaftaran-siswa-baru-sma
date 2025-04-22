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
public class SiswaReguler5 extends SiswaBaru5 {
    private double biayaPendaftaran;

    // Constructor lengkap & overload
    public SiswaReguler5(String nama, String alamat, String jenisKelamin, String asalSekolah,
                        String tanggalLahir, String nomorTelepon, String jurusan, double biayaPendaftaran) {
        super(nama, alamat, jenisKelamin, asalSekolah, tanggalLahir, nomorTelepon, jurusan);
        this.biayaPendaftaran = biayaPendaftaran;
    }

    public SiswaReguler5(String nama, String jurusan, double biayaPendaftaran) {
        super(nama, jurusan);
        this.biayaPendaftaran = biayaPendaftaran;
    }

    // Getter & Setter
    public double getBiayaPendaftaran() { return biayaPendaftaran; }
    public void setBiayaPendaftaran(double biaya) { this.biayaPendaftaran = biaya; }

    // Overriding & Overloading cetakDataSiswaBaru
    @Override
    public void cetakDataSiswaBaru() {
        super.cetakDataSiswaBaru();
        System.out.println("Biaya Pendaftaran: Rp " + biayaPendaftaran);
    }

    public void cetakDataSiswaBaru(boolean singkat) {
        System.out.println(singkat ?
            "Nama: " + nama + ", Jurusan: " + jurusan + ", Biaya: Rp " + biayaPendaftaran :
            ""); // jika tidak singkat, biarkan kosong (bisa panggil yang utama)
        if (!singkat) cetakDataSiswaBaru();
    }
}

