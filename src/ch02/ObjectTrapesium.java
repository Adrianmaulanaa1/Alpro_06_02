package ch02;

public class ObjectTrapesium {
    public static void main(String[] args) {
        Trapesium trapesium = new Trapesium();
        trapesium.alasBawah = 23;
        trapesium.alasAtas = 16;
        trapesium.tinggi = 14;
        System.out.println("Luas = " + trapesium.luas()); 
    }
}