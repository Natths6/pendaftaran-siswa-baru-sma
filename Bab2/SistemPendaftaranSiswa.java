/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab2;

/**
 *
 * @author tasya
 */
public class SistemPendaftaranSiswa {
    public static void main(String[] args) {
        // Membuat objek (siswa baru)
        SiswaBaru siswa = new SiswaBaru(
            "Rakhis Laras AnasTasya",
            "Perempuan",
            "SMP Negeri 5 Malang",
            "10 Mei 2006",
            "JL. Aja Ga Jadian No. 10, Malang",
            "081234567890",
            "IPA"    
        );
        // Menampilkan data siswa baru
        siswa.cetakDataSiswaBaru();
    }
}