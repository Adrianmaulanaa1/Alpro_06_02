package ch05;

import java.util.Scanner;
public class Euclidean {
    public static void main(String[] args) {
        int A, B, C;
        Scanner ras = new Scanner(System.in);
        System.out.print("A : ");
        A = ras.nextInt();

        System.out.print("B : ");
        B = ras.nextInt();

        C = A % B;
        while (C != 0){
            A = B;
            B = C;
            C = B % C;
        }

        System.out.println("FPB = " + B);
    }
}
