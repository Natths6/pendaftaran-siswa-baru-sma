/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab6;

/**
 *
 * @author tasya
 */
//superclass
public abstract class siswabaru {
  String nama, jenisKelamin, asalSekolah, tanggalLahir, alamat, nomorTelepon, jurusan;

  public siswabaru (String nama, String jenisKelamin, String asalSekolah, 
          String tanggalLahir, String alamat, String nomorTelepon, String jurusan) {
    this.nama = nama;
    this.jenisKelamin = jenisKelamin;
    this.asalSekolah = asalSekolah;
    this.tanggalLahir = tanggalLahir;
    this.alamat = alamat;
    this.nomorTelepon = nomorTelepon;
    this.jurusan = jurusan;
  }

  public abstract void cetakDataSiswa();
}