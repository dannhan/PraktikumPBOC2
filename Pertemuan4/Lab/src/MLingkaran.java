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
    }
}
