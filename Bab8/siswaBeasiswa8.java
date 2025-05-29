/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8;

/**
 *
 * @author tasya
 */
// Subclass
public class siswaBeasiswa8 extends siswaBaru8{
    protected String jenisBeasiswa;

    // Konstruktor beasiswa, melempar exception jika jenis beasiswa kosong
    public siswaBeasiswa8(String nama, String alamat, String jenisKelamin, String asalSekolah,
                      String tanggalLahir, String nomorTelepon, String jurusan, String jenisBeasiswa)
            throws exception {
        super(nama, alamat, jenisKelamin, asalSekolah, tanggalLahir, nomorTelepon, jurusan);

        if (jenisBeasiswa == null || jenisBeasiswa.isEmpty()) {
            throw new exception("Jenis beasiswa tidak boleh kosong.");
        }

        this.jenisBeasiswa = jenisBeasiswa;
    }

    @Override
    public void cetakDataSiswa() {
        System.out.println("=== Data Siswa Beasiswa ===");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Asal Sekolah: " + asalSekolah);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Nomor Telepon: " + nomorTelepon);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Jenis Beasiswa: " + jenisBeasiswa);
    }

    private static class exception extends Exception {

        public exception(String jenis_beasiswa_tidak_boleh_kosong) {
        }
    }
}