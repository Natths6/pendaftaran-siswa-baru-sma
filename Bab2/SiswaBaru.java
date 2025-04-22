package Bab2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tasya
 */
// Object Class (Siswa.java)
public class SiswaBaru {
    // Atribut untuk menyimpan informasi siswa
    String nama, jenisKelamin, asalSekolah, tanggalLahir, alamat, nomorTelepon, jurusan;

    // Konstruktor
    public SiswaBaru(String nama, String jenisKelamin, String asalSekolah, String tanggalLahir, String alamat, String nomorTelepon, String jurusan) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.asalSekolah = asalSekolah;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.jurusan = jurusan;
    }

    // Metode untuk mencetak informasi siswa
    public void cetakDataSiswaBaru() {
        System.out.println("=== Data Pendaftaran Siswa Baru ===");
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin  : " + jenisKelamin);
        System.out.println("Asal Sekolah   : " + asalSekolah);
        System.out.println("Tanggal Lahir  : " + tanggalLahir);
        System.out.println("Alamat         : " + alamat);
        System.out.println("Nomor Telepon  : " + nomorTelepon);
        System.out.println("Jurusan        : " + jurusan);
    }
}