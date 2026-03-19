/*
 * File: DosenTamu.java
 * Deskripsi: Subclass untuk Dosen Tamu
 * Pembuat: Ahmad Danun Hanani
 * Tanggal: 17 Maret 2026
 */

public final class DosenTamu extends Dosen {
    private String nidk;
    private String tanggalBerakhirKontrak; // Format: YYYY-MM-DD

    public DosenTamu(
            String nip,
            String nidk,
            String nama,
            String tanggalLahir,
            String tmtBekerja,
            double gajiPokok,
            String tanggalBerakhirKontrak,
            String fakultas) {
        super(nip, nama, tanggalLahir, tmtBekerja, gajiPokok, fakultas);
        this.nidk = nidk;
        this.jabatan = "Dosen Tamu";
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    /******************** SELEKTOR ********************/
    public String getNidk() {
        return nidk;
    }

    public String getTanggalBerakhirKontrak() {
        return tanggalBerakhirKontrak;
    }

    public double getTunjangan() {
        return 0.025 * getGajiPokok();
    }

    @Override
    public void printInfo() {
        System.out.println("NIP                      : " + getNip());
        System.out.println("NIDK                     : " + getNidk());
        System.out.println("Nama                     : " + getNama());
        System.out.println("Tanggal Lahir            : " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT Bekerja              : " + formatTanggal(getTmtBekerja()));
        System.out.println("Jabatan                  : " + getJabatan());
        System.out.println("Fakultas                 : " + getFakultas());
        System.out.println("Masa Kerja               : " + formatMasaKerja(getMasaKerja()));
        System.out.println(
                "Tanggal Berakhir Kontrak : " + formatTanggal(getTanggalBerakhirKontrak()));
        System.out.println("Gaji Pokok               : " + formatRupiah(getGajiPokok()));
        System.out.printf(
                "Tunjangan                : 2.5%% x %s = %s\n",
                formatRupiah(getGajiPokok()), formatRupiah(getTunjangan()));
    }
}
