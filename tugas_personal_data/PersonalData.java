package tugas_personal_data;

public class PersonalData {
    private String nim = "A11.2023.14900";
    private String nama = "Khafidha Sukma Dewi";
    private String alamat = "Desa Rejosari RT 05/RW 01 Karangawen";
    private String kota = "Demak";
    private String kodePos = "59566";
    private String telp = "-";
    private String hp = "087704486603";
    private String email = "111202314900@mhs.dinus.ac.id";

    // method for showing personal data
    public void showPersonalData() {
        System.out.println("Data Pribadi:");
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Alamat  : " + alamat);
        System.out.println("Kota    : " + kota);
        System.out.println("Kode Pos: " + kodePos);
        System.out.println("Telp.   : " + telp);
        System.out.println("Hp      : " + hp);
        System.out.println("Email   : " + email);
    }

    // method for running the program
    public static void main(String[] args) {
        PersonalData data = new PersonalData();
        data.showPersonalData();
    }
}

