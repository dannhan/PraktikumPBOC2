/*
 * File: DosenTetap.java
 * Deskripsi: Subclass untuk Dosen Tetap
 * Pembuat: Ahmad Danun Hanani
 * Tanggal: 17 Maret 2026
 */

public final class DosenTetap extends Dosen {
    private String nidn;
    private String bup;

    public DosenTetap(
            String nip,
            String nidn,
            String nama,
            String tanggalLahir,
            String tmtBekerja,
            String gajiPokok,
            String bup,
            String fakultas) {
        super(nip, nama, tanggalLahir, tmtBekerja, gajiPokok, fakultas);
        this.nidn = nidn;
        this.bup = bup;
        this.jabatan = "Dosen Tetap";
    }

    /******************** SELEKTOR ********************/
    public String getNidn() {
        return nidn;
    }

    public String getBup() {
        return bup;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP           : " + getNip());
        System.out.println("NIDN          : " + getNidn());
        System.out.println("Nama          : " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggalLahir());
        System.out.println("TMT Bekerja   : " + getTmtBekerja());
        System.out.println("Jabatan       : " + getJabatan());
        System.out.println("Fakultas      : " + getFakultas());
        // TODO: System.out.println("Masa Kerja : " + getMasaKerja());
        // TODO: System.out.println("Tanggal Pensiun : " + getTanggalPensiun());
        System.out.println("Gaji Pokok    : " + getGajiPokok());
        // TODO: System.out.println("Tunjangan : " + getTunjangan());
    }
}
