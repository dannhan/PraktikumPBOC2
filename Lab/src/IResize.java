/*
 * Nama File   : IResize.java
 * Deskripsi   : IResize untuk mengubah ukuran Bangun Data
 * Pembuat     : Ahmad Danun Hanani
 * Tanggal     : 26 Maret 2026
 */

public interface IResize {
    // Method untuk memperbesar ukuran sebesar 10%
    public void zoomIn();

    // Method untuk memperkecil ukuran sebesar 10%
    public void zoomOut();

    // Method untuk mengubah ukuran berdasarkan persentase tertentu
    public void zoom(int percent);
}
