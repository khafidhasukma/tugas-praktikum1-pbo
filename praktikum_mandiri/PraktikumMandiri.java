package praktikum_mandiri;

public class PraktikumMandiri {
    public static void main(String[] args) {
        // SOAL 1
        System.out.println("Halo, nama saya adalah Khafidha Sukma Dewi");
        System.out.println("Saya adalah mahasiswa Teknik Informatika Universitas Dian Nuswantoro");
        System.out.println("Saya sedang menulis program Java\n");        

        // SOAL 2
        // a. Menghitung Keliling Lingkaran dengan diameter = 10
        int diameterLingkaran = 10;
        float kelilingLingkaran = (float) (Math.PI * diameterLingkaran);
        System.out.println("Keliling Lingkaran dengan diameter " + diameterLingkaran + ": " + kelilingLingkaran);

        // b. Menghitung Luas Segitiga Siku-Siku dengan alas = 6, tinggi = 8
        int alasSegitiga = 6;
        int tinggiSegitiga = 8;
        float luasSegitiga = (alasSegitiga * tinggiSegitiga) / 2.0f;
        System.out.println("Luas Segitiga Siku-siku dengan alas " + alasSegitiga + " dan tinggi " + tinggiSegitiga + ": " + luasSegitiga);

        // c. Menghitung Volume Tabung dengan diameter = 5, tinggi = 10
        int diameterTabung = 5;
        float jariJariTabung = diameterTabung / 2.0f;
        int tinggiTabung = 10;
        float volumeTabung = (float) (Math.PI * Math.pow(jariJariTabung, 2) * tinggiTabung);
        System.out.println("Volume Tabung dengan diameter " + diameterTabung + " dan tinggi " + tinggiTabung + ": " + volumeTabung);
    }
}
