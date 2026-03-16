/*
 * File : Lingkaran.java
 * Deskripsi : Subclass untuk lingkaran
 * Pembuat : Ahmad Danun Hanani
 * Tanggal : 12 Maret 2026
 */

public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran() {
        setJari(0);
    }

    public Lingkaran(double jari, String warna, String border) {
        super(0, warna, border);
        this.jari = jari;
        setJari(jari);
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        System.out.println("Jari-jari    : " + jari);
        System.out.println("Warna        : " + getWarna());
        System.out.println("Border       : " + getBorder());
    }
}
