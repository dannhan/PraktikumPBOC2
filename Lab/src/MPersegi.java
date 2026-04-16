public class MPersegi {
    public static void main(String[] args) {
        Persegi P1 = new Persegi(4, "Merah", "Solid");

        System.out.println("Persegi 1:");
        P1.printInfo();
        System.out.println("Luas Persegi       : " + P1.getLuas());
        System.out.println("Keliling Persegi   : " + P1.getKeliling());

        Persegi P2 = new Persegi(8, "Biru", "Dotted");
        P2.setSisi(10);

        System.out.println("\nPersegi 2:");
        P2.printInfo();
        System.out.println("Luas Persegi       : " + P2.getLuas());
        System.out.println("Keliling Persegi   : " + P2.getKeliling());
    }
}
