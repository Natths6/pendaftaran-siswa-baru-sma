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
public class beasiswa_7 extends siswabaru_7{
    protected String jenisBeasiswa;

    public beasiswa_7 (String nama, String alamat, String jenisKelamin, String asalSekolah, 
            String tanggalLahir, String nomorTelepon, String jurusan, String jenisBeasiswa) {
        super(nama, alamat, jenisKelamin, asalSekolah, tanggalLahir, nomorTelepon, jurusan);
        this.jenisBeasiswa = jenisBeasiswa;
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
        System.out.println("Jenis Beasiswa: " + jenisBeasiswa);
    }
}