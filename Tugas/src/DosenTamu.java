/*
 * File: DosenTamu.java
 * Deskripsi: Subclass untuk Dosen Tamu
 * Pembuat: Ahmad Danun Hanani
 * Tanggal: 17 Maret 2026
 */

public final class DosenTamu extends Dosen {
    private String nidk;

    public DosenTamu(
            String nip,
            String nidk,
            String nama,
            String tanggalLahir,
            String tmtBekerja,
            String gajiPokok,
            String fakultas) {
        super(nip, nama, tanggalLahir, tmtBekerja, gajiPokok, fakultas);
        this.nidk = nidk;
        this.jabatan = "Dosen Tamu";
    }

    /******************** SELEKTOR ********************/
    public String getNidk() {
        return nidk;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP           : " + getNip());
        System.out.println("NIDK          : " + getNidk());
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
