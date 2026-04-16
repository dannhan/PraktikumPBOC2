public class MBangunDatar {
    public static void main(String[] args) {
        // MPersegi.main(args);
        // MLingkaran.main(args);

        // System.out.println();
        // BangunDatar.printCounterBangunDatar();

        BangunDatar P1 = new Persegi(4, "Merah", "Solid");

        System.out.println("Persegi 1:");
        System.out.println("Luas Persegi       : " + P1.getLuas());
        System.out.println("Keliling Persegi   : " + P1.getKeliling());
        // P1.printInfo();

        Persegi P2 = new Persegi(8, "Biru", "Dotted");
        System.out.println("Luas Persegi       : " + P2.getLuas());
        System.out.println("Keliling Persegi   : " + P2.getKeliling());
        // P2.printInfo();

        System.out.println("\nLuas P1 == Luas P2? " + P1.isEqualLuas(P2));

        System.out.println("Sisi sebelum resize : " + ((Persegi) P1).getSisi());

        ((Persegi) P1).zoomIn();
        P2.zoomOut();

        System.out.println("Sisi setelah resize : " + ((Persegi) P1).getSisi());

        BangunDatar.printCounterBangunDatar();
    }
}
