package ch02;

import java.util.Date;

public class ObjectObat {
    public static void main (String[] args) {
        Obat a1 = new Obat();
        a1.barcode = "8364537463";
        a1.nama = "Panadol Flu dan Batuk";
        a1.tanggalKadaluarsa = new Date (2020, 11, 15);
        a1.harga = 8000;

        Obat a2 = new Obat();
        a2.barcode = "6574832942";
        a2.nama = "Decolgen";
        a2.tanggalKadaluarsa = new Date (2020, 12, 29);
        a2.harga = 4500;

        System.out.println(a1.nama +" (" + a1.barcode + ")");
        System.out.println("Harga: Rp" + a1.harga);
        System.out.println("Exp: " + a1.tanggalKadaluarsa.toString());
 
        System.out.println("===============================");

        System.out.println(a2.nama +" (" + a2.barcode + ")");
        System.out.println("Harga: Rp" + a2.harga);
        System.out.println("Exp: " + a2.tanggalKadaluarsa.toString());
    }
}