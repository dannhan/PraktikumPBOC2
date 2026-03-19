/*
 * File: Pegawai.java
 * Deskripsi: Superclass untuk pegawai
 * Pembuat: Ahmad Danun Hanani
 * Tanggal: 17 Maret 2026
 */

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

abstract class Pegawai {
    private String nip;
    private String nama;
    private String tanggalLahir; // Format: YYYY-MM-DD
    private String tmtBekerja; // Format: YYYY-MM-DD
    private double gajiPokok;
    protected String jabatan;

    public Pegawai(
            String nip, String nama, String tanggalLahir, String tmtBekerja, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmtBekerja = tmtBekerja;
        this.gajiPokok = gajiPokok;
    }

    public Period getMasaKerja() {
        LocalDate tmt = LocalDate.parse(tmtBekerja);
        LocalDate now = LocalDate.now();
        return Period.between(tmt, now);
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

    public double getGajiPokok() {
        return gajiPokok;
    }

    public String getJabatan() {
        return jabatan;
    }

    /************************ UTILITY ********************/
    public String formatRupiah(double amount) {
        Locale locale = Locale.forLanguageTag("id-ID");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        return format.format(amount).replace("Rp", "Rp ");
    }

    public String formatTanggal(String tanggal) {
        Locale locale = Locale.forLanguageTag("id-ID");
        LocalDate date = LocalDate.parse(tanggal);
        DateTimeFormatter formatter =
                java.time.format.DateTimeFormatter.ofPattern("d MMMM yyyy", locale);
        return date.format(formatter);
    }

    public String formatMasaKerja(Period masaKerja) {
        return masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan";
    }

    abstract void printInfo();
}
