public class MPersegi {
    public static void main(String[] args) {
        Persegi P1 = new Persegi(4, "Merah", "Solid");

        System.out.println("Persegi 1:");
        P1.printInfo();
        System.out.println("Luas        : " + P1.getSisi() * P1.getSisi());
        System.out.println("Keliling    : " + 4 * P1.getSisi());

        Persegi P2 = new Persegi(8, "Biru", "Dotted");
        P2.setSisi(10);

        System.out.println("\nPersegi 2:");
        P2.printInfo();
        System.out.println("Luas        : " + P2.getSisi() * P2.getSisi());
        System.out.println("Keliling    : " + 4 * P2.getSisi());
    }
}
