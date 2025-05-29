/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8;

/**
 *
 * @author tasya
 */
//suprclass
public abstract class siswaBaru8 {
    // Konstruktor untuk inisialisasi data siswa
      String nama, jenisKelamin, asalSekolah, tanggalLahir, alamat, nomorTelepon, jurusan;
    public siswaBaru8(String nama, String alamat, String jenisKelamin, String asalSekolah,
                       String tanggalLahir, String nomorTelepon, String jurusan) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.asalSekolah = asalSekolah;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.jurusan = jurusan;
    }

    // Method abstrak untuk dicetak oleh subclass
    public abstract void cetakDataSiswa();
}