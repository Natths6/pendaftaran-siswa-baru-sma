package Bab1;

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

    // Metode untuk mengisi data siswa
    public void dataNama(String nama) {
        this.nama = nama;
    }
    public void dataJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public void dataAsalSekolah(String asalSekolah) {
        this.asalSekolah = asalSekolah;
    }
    public void dataTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    public void dataAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void dataNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }
    public void dataJurusan(String jurusan) {
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

