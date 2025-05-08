/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab6;

/**
 *
 * @author tasya
 */
public class cetak {
    public static void main(String[] args) {
        // Membuat objek Siswa Reguler
        reguler siswa1 = new reguler(
            "Jean",
            "Jl. Merdeka No. 12",
            "Laki-laki",
            "SMP Negeri 1",
            "12 Maret 2005",
            "081234567890",
            "BAHASA",
            1500000
        );

        // Membuat objek Siswa Beasiswa
        beasiswa siswa2 = new beasiswa(
            "Billie",
            "Jl. Anggrek No. 8",
            "Perempuan",
            "SMP Negeri 2",
            "20 Juli 2005",
            "082134567891",
            "IPA",
            "Beasiswa Prestasi"
        );

        // Menampilkan data masing-masing siswa
        System.out.println("=== Data Siswa Reguler ===");
        siswa1.cetakDataSiswa();

        System.out.println("\n=== Data Siswa Beasiswa ===");
        siswa2.cetakDataSiswa();
    }
}