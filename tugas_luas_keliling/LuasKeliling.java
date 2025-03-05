package tugas_luas_keliling;

public class LuasKeliling {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nPilih bentuk untuk dihitung:");
            System.out.println("1. Persegi");
            System.out.println("2. Segitiga");
            System.out.println("3. Lingkaran");
            System.out.println("4. Kubus");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan (1-5): ");

            int pilihan = readNumber();

            if (pilihan == 5) {
                System.out.println("Terima kasih telah menggunakan program ini!");
                break;
            }

            if (pilihan == 1) {
                hitungPersegi();
            } else if (pilihan == 2) {
                hitungSegitiga();
            } else if (pilihan == 3) {
                hitungLingkaran();
            } else if (pilihan == 4) {
                hitungKubus();
            } else {
                System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
    }

    // method for calculating square
    public static void hitungPersegi() {
        System.out.print("Masukkan sisi persegi: ");
        int sisi = readNumber();
        int luas = sisi * sisi;
        int keliling = 4 * sisi;
        System.out.println("Luas Persegi: " + luas);
        System.out.println("Keliling Persegi: " + keliling);
    }

    // method for calculating triangle
    public static void hitungSegitiga() {
        System.out.print("Masukkan alas segitiga: ");
        int alas = readNumber();
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = readNumber();
        int luas = (alas * tinggi) / 2;
        System.out.print("Masukkan sisi 1 segitiga: ");
        int sisi1 = readNumber();
        System.out.print("Masukkan sisi 2 segitiga: ");
        int sisi2 = readNumber();
        int keliling = alas + sisi1 + sisi2;
        System.out.println("Luas Segitiga: " + luas);
        System.out.println("Keliling Segitiga: " + keliling);
    }

    // method for calculating circle
    public static void hitungLingkaran() {
        System.out.print("Masukkan jari-jari lingkaran: ");
        int r = readNumber();
        double luas = 3.14 * r * r;
        double keliling = 2 * 3.14 * r;
        System.out.println("Luas Lingkaran: " + luas);
        System.out.println("Keliling Lingkaran: " + keliling);
    }

    // method for calculating cube
    public static void hitungKubus() {
        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = readNumber();
        int luas = 6 * sisi * sisi;
        int keliling = 12 * sisi;
        System.out.println("Luas Permukaan Kubus: " + luas);
        System.out.println("Keliling Kubus: " + keliling);
    }

    // method for reading number from input
    public static int readNumber() {
        int num = 0;
        int ch;
        try {
            while ((ch = System.in.read()) != '\n') {
                if (ch >= '0' && ch <= '9') {
                    num = num * 10 + (ch - '0');
                }
            }
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input!");
        }
        return num;
    }
}
