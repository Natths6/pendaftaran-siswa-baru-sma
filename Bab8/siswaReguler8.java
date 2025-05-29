/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8;

/**
 *
 * @author tasya
 */
// Subclass
public class siswaReguler8 extends siswaBaru8 {
    protected double biayaPendaftaran;

    // Konstruktor reguler, menggunakan throws untuk melempar custom exception jika biaya tidak valid
    public siswaReguler8(String nama, String alamat, String jenisKelamin, String asalSekolah,
                     String tanggalLahir, String nomorTelepon, String jurusan, double biayaPendaftaran)
            throws exception {
        super(nama, alamat, jenisKelamin, asalSekolah, tanggalLahir, nomorTelepon, jurusan);

        if (biayaPendaftaran <= 0) {
            // Lempar exception jika nilai biaya tidak valid
            throw new exception("Biaya pendaftaran harus lebih dari 0.");
        }

        this.biayaPendaftaran = biayaPendaftaran;
    }

    // Override method abstrak
    @Override
    public void cetakDataSiswa() {
        System.out.println("=== Data Siswa Reguler ===");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Asal Sekolah: " + asalSekolah);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Nomor Telepon: " + nomorTelepon);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Biaya Pendaftaran: " + biayaPendaftaran);
    }

    private static class exception extends Exception {

        public exception() {
        }

        private exception(String biaya_pendaftaran_harus_lebih_dari_0) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}