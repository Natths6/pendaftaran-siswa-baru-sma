/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Bab1;

/**
 *
 * @author tasya
 */
public class SistemPendaftaranSiswa {
    public static void main(String[] args) {
        // Membuat objek (siswa baru)
        SiswaBaru siswaBaru = new SiswaBaru();

        // Mengisi data siswa
        siswaBaru.dataNama("Rakhis Laras AnasTasya");
        siswaBaru.dataJenisKelamin("Perempuan");
        siswaBaru.dataAsalSekolah("SMP Negeri 5 Malang");
        siswaBaru.dataTanggalLahir("10 Mei 2006");
        siswaBaru.dataAlamat("Jl. Aja Ga Jadian No. 10, Malang");
        siswaBaru.dataNomorTelepon("081234567890");
        siswaBaru.dataJurusan("IPA");

        // Menampilkan data siswa baru
        siswaBaru.cetakDataSiswaBaru();
    }
}
