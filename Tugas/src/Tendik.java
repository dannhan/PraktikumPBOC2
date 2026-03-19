/*
 * File: Tendik.java
 * Deskripsi: Subclass untuk tendik
 * Pembuat: Ahmad Danun Hanani
 * Tanggal: 18 Maret 2026
 */

import java.time.LocalDate;

public final class Tendik extends Pegawai {
    private String bidang;
    private int bup = 55;

    public Tendik(
            String nip,
            String nama,
            String tanggalLahir,
            String tmtBekerja,
            double gajiPokok,
            String bidang) {
        super(nip, nama, tanggalLahir, tmtBekerja, gajiPokok);
        this.jabatan = "Tendik";
        this.bidang = bidang;
    }

    /******************** SELEKTOR ********************/
    public int getBup() {
        return bup;
    }

    public String getBidang() {
        return bidang;
    }

    public String getTanggalPensiun() {
        LocalDate born = LocalDate.parse(getTanggalLahir());
        return born.plusYears(bup).plusMonths(1).minusDays(born.getDayOfMonth() - 1).toString();
    }

    public double getTunjangan() {
        return 0.01 * getMasaKerja().getYears() * getGajiPokok();
    }

    @Override
    public void printInfo() {
        System.out.println("NIP             : " + getNip());
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT Bekerja     : " + formatTanggal(getTmtBekerja()));
        System.out.println("Jabatan         : " + getJabatan());
        System.out.println("Bidang          : " + getBidang());
        System.out.println("Masa Kerja      : " + formatMasaKerja(getMasaKerja()));
        System.out.println("Tanggal Pensiun : " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok      : " + formatRupiah(getGajiPokok()));
        System.out.printf(
                "Tunjangan       : 1%% x %d x %s = %s\n",
                getMasaKerja().getYears(),
                formatRupiah(getGajiPokok()),
                formatRupiah(getTunjangan()));
    }
}
