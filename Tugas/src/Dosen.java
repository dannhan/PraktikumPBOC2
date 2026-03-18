/*
 * File: Dosen.java
 * Deskripsi: Abstract class untuk Dosen
 * Pembuat: Ahmad Danun Hanani
 * Tanggal: 17 Maret 2026
 */

abstract class Dosen extends Pegawai {
    private String fakultas;

    public Dosen(
            String nip,
            String nama,
            String tanggalLahir,
            String tmtBekerja,
            String gajiPokok,
            String fakultas) {
        super(nip, nama, tanggalLahir, tmtBekerja, gajiPokok);
        this.fakultas = fakultas;
    }

    /******************** SELEKTOR ********************/
    public String getFakultas() {
        return fakultas;
    }
}
