/*
 * File: Tendik.java
 * Deskripsi: Subclass untuk tendik
 * Pembuat: Ahmad Danun Hanani
 * Tanggal: 18 Maret 2026
 */

public final class Tendik extends Pegawai {
    public enum Bidang {
        AKADEMIK,
        KEMAHASISWAAN,
        SUMBER_DAYA,
    }

    private String bup;
    private Bidang bidang;

    public Tendik(
            String nip,
            String nama,
            String tanggalLahir,
            String tmtBekerja,
            String gajiPokok,
            String bup,
            Bidang bidang) {
        super(nip, nama, tanggalLahir, tmtBekerja, gajiPokok);
        this.bup = bup;
        this.bidang = bidang;
    }

    /******************** SELEKTOR ********************/
    public String getBup() {
        return bup;
    }

    public Bidang getBidang() {
        return bidang;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP           : " + getNip());
        System.out.println("Nama          : " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggalLahir());
        System.out.println("TMT Bekerja   : " + getTmtBekerja());
        // TODO: System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Bidang        : " + getBidang());
        System.out.println("Gaji Pokok    : " + getGajiPokok());
    }
}
