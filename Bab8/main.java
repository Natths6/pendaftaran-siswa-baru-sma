/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8;

/**
 *
 * @author tasya
 */
import java.util.Scanner;

// Kelas utama untuk menguji input dan implementasi exception handling
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // Input data siswa
            System.out.println("=== Pendaftaran Siswa Baru ===");

            System.out.print("Nama: ");
            String nama = input.nextLine();

            System.out.print("Alamat: ");
            String alamat = input.nextLine();

            System.out.print("Jenis Kelamin (L/P): ");
            String jenisKelamin = input.nextLine();

            System.out.print("Asal Sekolah: ");
            String asalSekolah = input.nextLine();

            System.out.print("Tanggal Lahir (dd-mm-yyyy): ");
            String tanggalLahir = input.nextLine();

            System.out.print("Nomor Telepon: ");
            String nomorTelepon = input.nextLine();

            System.out.print("Jurusan: ");
            String jurusan = input.nextLine();

            System.out.print("Pilih Tipe Pendaftaran (1. Reguler | 2. Beasiswa): ");
            int pilihan = Integer.parseInt(input.nextLine());

            // Pilihan: siswa reguler
            if (pilihan == 1) {
                System.out.print("Biaya Pendaftaran: ");
                double biaya = Double.parseDouble(input.nextLine());

                // Buat objek siswa reguler, validasi akan ditangkap jika tidak sesuai
                siswaBaru8 siswa = new siswaReguler8(nama, alamat, jenisKelamin, asalSekolah,
                        tanggalLahir, nomorTelepon, jurusan, biaya);
                siswa.cetakDataSiswa();

            // Pilihan: siswa beasiswa
            } else if (pilihan == 2) {
                System.out.print("Jenis Beasiswa: ");
                String jenisBeasiswa = input.nextLine();

                // Buat objek siswa beasiswa
                siswaBaru8 siswa = new siswaBeasiswa8(nama, alamat, jenisKelamin, asalSekolah,
                        tanggalLahir, nomorTelepon, jurusan, jenisBeasiswa);
                siswa.cetakDataSiswa();

            } else {
                // Lempar exception jika pilihan bukan 1 atau 2
                throw new exception("Pilihan hanya 1 (Reguler) atau 2 (Beasiswa).");
            }

        // Tangkap error validasi dari konstruktor
        } catch (exception e) {
            System.out.println("Input tidak valid: " + e.getMessage());

        // Tangkap error input angka yang tidak valid (String jadi Integer/Double)
        } catch (NumberFormatException e) {
            System.out.println("Format angka tidak sesuai. Harap masukkan angka dengan benar.");

        // Tangkap semua error lainnya
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());

        // Block yang selalu dijalankan
        } finally {
            input.close(); // Tutup Scanner
            System.out.println("Program selesai dijalankan.");
        }
    }

    private static class exception extends Exception {

        public exception(String pilihan_hanya_1_Reguler_atau_2_Beasiswa) {
        }
    }
}
