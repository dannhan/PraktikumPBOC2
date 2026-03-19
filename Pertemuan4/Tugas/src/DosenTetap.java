/*
 * File: DosenTetap.java
 * Deskripsi: Subclass untuk Dosen Tetap
 * Pembuat: Ahmad Danun Hanani
 * Tanggal: 17 Maret 2026
 */

import java.time.LocalDate;

public final class DosenTetap extends Dosen {
    private String nidn;
    private int bup = 65;

    public DosenTetap(
            String nip,
            String nidn,
            String nama,
            String tanggalLahir,
            String tmtBekerja,
            double gajiPokok,
            String fakultas) {
        super(nip, nama, tanggalLahir, tmtBekerja, gajiPokok, fakultas);
        this.nidn = nidn;
        this.jabatan = "Dosen Tetap";
    }

    /******************** SELEKTOR ********************/
    public String getNidn() {
        return nidn;
    }

    public int getBup() {
        return bup;
    }

    public String getTanggalPensiun() {
        LocalDate born = LocalDate.parse(getTanggalLahir());
        return born.plusYears(bup).plusMonths(1).minusDays(born.getDayOfMonth() - 1).toString();
    }

    public double getTunjangan() {
        return 0.02 * getMasaKerja().getYears() * getGajiPokok();
    }

    @Override
    public void printInfo() {
        System.out.println("NIP             : " + getNip());
        System.out.println("NIDN            : " + getNidn());
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT Bekerja     : " + formatTanggal(getTmtBekerja()));
        System.out.println("Jabatan         : " + getJabatan());
        System.out.println("Fakultas        : " + getFakultas());
        System.out.println("Masa Kerja      : " + formatMasaKerja(getMasaKerja()));
        System.out.println("Tanggal Pensiun : " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok      : " + formatRupiah(getGajiPokok()));
        System.out.printf(
                "Tunjangan       : 2%% x %d x %s = %s\n",
                getMasaKerja().getYears(),
                formatRupiah(getGajiPokok()),
                formatRupiah(getTunjangan()));
    }
}
