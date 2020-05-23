package ch02;

public class ObjectFakultas {
    public static void main(String[] args) {
        Fakultas fk1 = new Fakultas ();
        Fakultas fk2 = new Fakultas ();

        fk1.nama = "Dakwah dan Komunikasi";
        fk1.jumlahMahasiswa = 2623;

        fk2.nama = "Ushuluddin";
        fk2.jumlahMahasiswa = 1112;

        System.out.println("Fakultas " + fk1.getNama() + ": " + fk1.getJumlahMahasiswa());
        System.out.println("Fakultas " + fk2.getNama() + ": " + fk2.getJumlahMahasiswa());
    }
}
        
     