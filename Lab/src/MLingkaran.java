public class MLingkaran {
    public static void main(String[] args) {
        Lingkaran L1 = new Lingkaran(7, "Biru", "Solid");

        System.out.println("\nLingkaran 1:");
        L1.printInfo();
        System.out.println("Jari        : " + L1.getJari());
        System.out.println("Luas        : " + L1.getLuas());
        System.out.println("Keliling    : " + L1.getKeliling());

        Lingkaran L2 = new Lingkaran(14, "Merah", "Dotted");

        System.out.println("\nLingkaran 2:");
        L2.printInfo();
        System.out.println("Jari        : " + L2.getJari());
        System.out.println("Luas        : " + L2.getLuas());
        System.out.println("Keliling    : " + L2.getKeliling());

        System.out.println("\nLuas L1 == Luas L2? " + L1.isEqualLuas(L2));

        System.out.println("Jari L1 sebelum zoom in : " + L1.getJari());
        System.out.println("Jari L2 sebelum zoom out : " + L2.getJari());

        L1.zoomIn();
        System.out.println("Jari L1 setelah zoom in : " + L1.getJari());

        L2.zoomOut();
        System.out.println("Jari L2 setelah zoom out : " + L2.getJari());
    }
}
