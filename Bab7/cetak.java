/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7;

/**
 *
 * @author tasya
 */
public class cetak {
    public static void main(String[] args) {
        // Dynamic Polymorphism (Superclass reference, subclass object)
        siswabaru_7 siswa1 = new reguler_7("Andi", "Jakarta", "Laki-laki", "SMA 1", "2005-01-01", "08123456789", "Teknik", 500000);
        siswabaru_7 siswa2 = new beasiswa_7 ("Budi", "Bandung", "Laki-laki", "SMA 2", "2005-02-01", "08987654321", "Ekonomi", "Bidikmisi");

        siswa1.cetakDataSiswa(); // Akan memanggil metode dari kelas reguler
        System.out.println("----------------------------");
        siswa2.cetakDataSiswa(); // Akan memanggil metode dari kelas beasiswa

        System.out.println("============================");

        // Static Polymorphism (Overloading)
        reguler_7 siswaReguler = new reguler_7("Santi", "Surabaya", "Perempuan", "SMA 3", "2005-03-01", "08765432100", "Akuntansi", 450000);
        siswaReguler.cetakDataSiswa("### Cetak Data dengan Header ###");
        System.out.println("----------------------------");
        siswaReguler.cetakDataSiswa(true);
    }
}
