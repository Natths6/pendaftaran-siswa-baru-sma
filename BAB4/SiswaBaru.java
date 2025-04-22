/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4;

/**
 *
 * @author tasya
 */
// Superclass
public class SiswaBaru {
    protected String nama;
    protected String alamat;
    protected String jenisKelamin;
    protected String asalSekolah;
    protected String tanggalLahir;
    protected String nomorTelepon;
    protected String jurusan;

    public SiswaBaru(String nama, String alamat, String jenisKelamin, String asalSekolah, String tanggalLahir, String nomorTelepon, String jurusan) {
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.asalSekolah = asalSekolah;
        this.tanggalLahir = tanggalLahir;
        this.nomorTelepon = nomorTelepon;
        this.jurusan = jurusan;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getAsalSekolah() {
        return asalSekolah;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public String getJurusan() {
        return jurusan;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setAsalSekolah(String asalSekolah) {
        this.asalSekolah = asalSekolah;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void cetakDataSiswaBaru() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Asal Sekolah: " + asalSekolah);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Nomor Telepon: " + nomorTelepon);
        System.out.println("Jurusan: " + jurusan);
    }
}