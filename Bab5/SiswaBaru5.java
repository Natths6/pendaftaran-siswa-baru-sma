/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5;

/**
 *
 * @author tasya
 */
// Superclass
public class SiswaBaru5 {
    protected String nama;
    protected String alamat;
    protected String jenisKelamin;
    protected String asalSekolah;
    protected String tanggalLahir;
    protected String nomorTelepon;
    protected String jurusan;

    // Constructor utama
    public SiswaBaru5(String nama, String alamat, String jenisKelamin, String asalSekolah, 
            String tanggalLahir, String nomorTelepon, String jurusan) {
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.asalSekolah = asalSekolah;
        this.tanggalLahir = tanggalLahir;
        this.nomorTelepon = nomorTelepon;
        this.jurusan = jurusan;
    }

    // Overloaded constructor (lebih singkat)
    public SiswaBaru5(String nama, String jurusan) {
        this.nama = nama;
        this.jurusan = jurusan;
    }

    // Getter dan Setter tetap sama...

    public void cetakDataSiswaBaru() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Asal Sekolah: " + asalSekolah);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Nomor Telepon: " + nomorTelepon);
        System.out.println("Jurusan: " + jurusan);
    }

    // Overloaded method cetakDataSiswaBaru
    public void cetakDataSiswaBaru(boolean singkat) {
        if (singkat) {
            System.out.println("Nama: " + nama + ", Jurusan: " + jurusan);
        } else {
            cetakDataSiswaBaru(); // panggil method utama
        }
    }
}
