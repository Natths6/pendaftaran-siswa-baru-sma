/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab6;

/**
 *
 * @author tasya
 */
//subclass
public class reguler extends siswabaru {
    protected double biayaPendaftaran;

    public reguler(String nama, String alamat, String jenisKelamin, String asalSekolah, 
            String tanggalLahir, String nomorTelepon, String jurusan, double biayaPendaftaran) {
        super(nama, alamat, jenisKelamin, asalSekolah, tanggalLahir, nomorTelepon, jurusan);
        this.biayaPendaftaran = biayaPendaftaran;
    }

    // Implementasi abstract method
    @Override
    public void cetakDataSiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Asal Sekolah: " + asalSekolah);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Nomor Telepon: " + nomorTelepon);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Biaya Pendaftaran: " + biayaPendaftaran);
    }
}