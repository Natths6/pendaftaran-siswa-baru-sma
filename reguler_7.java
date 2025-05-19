/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7;

/**
 *
 * @author tasya
 */
//subclass
public class reguler_7 extends siswabaru_7 {
    protected double biayaPendaftaran;

    public reguler_7 (String nama, String alamat, String jenisKelamin, String asalSekolah, 
            String tanggalLahir, String nomorTelepon, String jurusan, double biayaPendaftaran) {
    super(nama, alamat, jenisKelamin, asalSekolah, tanggalLahir, nomorTelepon, jurusan);
    this.biayaPendaftaran = biayaPendaftaran;
    }

    // Method Overriding (Dynamic Polymorphism)
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

    // Method Overloading (Static Polymorphism)
    public void cetakDataSiswa(String header) {
        System.out.println(header);
        cetakDataSiswa(); // Panggil versi default
    }

    public void cetakDataSiswa(boolean tampilBiayaSaja) {
        if (tampilBiayaSaja) {
            System.out.println("Biaya Pendaftaran: " + biayaPendaftaran);
        } else {
            cetakDataSiswa(); // Panggil versi default
        }
    }
}