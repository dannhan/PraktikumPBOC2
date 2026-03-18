/*
 * File: Pegawai.java
 * Deskripsi: Superclass untuk pegawai
 * Pembuat: Ahmad Danun Hanani
 * Tanggal: 17 Maret 2026
 */

abstract class Pegawai {
    private String nip;
    private String nama;
    private String tanggalLahir;
    private String tmtBekerja;
    private String gajiPokok;

    // private String jabatan;

    public Pegawai(
            String nip, String nama, String tanggalLahir, String tmtBekerja, String gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmtBekerja = tmtBekerja;
        this.gajiPokok = gajiPokok;
    }

    /******************** SELEKTOR ********************/
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public String getTmtBekerja() {
        return tmtBekerja;
    }

    public String getGajiPokok() {
        return gajiPokok;
    }

    abstract void printInfo();
}
