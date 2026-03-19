public class MDosen {
    public static void main(String[] args) {
        Dosen Dosen1 =
                new DosenTetap(
                        "9545647548",
                        "78647324",
                        "Andi",
                        "1990-05-05",
                        "2015-01-01",
                        5000000,
                        "Fakultas Sains dan Matematika");

        Dosen Dosen2 =
                new DosenTamu(
                        "874295489",
                        "49285782",
                        "Budi",
                        "1994-02-23",
                        "2025-02-05",
                        5000000,
                        "2027-02-05",
                        "Fakultas Sains dan Matematika");

        System.out.println("===== Informasi Dosen Tetap =====");
        Dosen1.printInfo();

        System.out.println();

        System.out.println("===== Informasi Dosen Tamu ======");
        Dosen2.printInfo();
    }
}
