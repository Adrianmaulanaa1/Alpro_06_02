package ch02;

public class ObjectPersegiPanjang {
    public static void main(String[] args) {
        PersegiPanjang b = new PersegiPanjang ();
        b.panjang = 14;
        b.lebar = 13;
        System.out.println("Luas Persegi Panjang = " + b.luas());
    }
}