package ch02;

import java.util.Date;

public class ObjectProduk {
    public static void main (String[] args) {
        Produk a1 = new Produk();
        a1.barcode = "6121212446";
        a1.nama = "Sunlight";
        a1.tanggalKadaluarsa = new Date (2021, 6, 11);
        a1.harga = 12500;

        Produk a2 = new Produk();
        a2.barcode = "86787892534";
        a2.nama = "Daia";
        a2.tanggalKadaluarsa = new Date (2021, 3, 23);
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