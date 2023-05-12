import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n sayısını giriniz: ");
        int n = input.nextInt();
        System.out.print("r sayısını giriniz: ");
        int r = input.nextInt();

        // n! / (r! * (n-r)!)
        int nFaktoriyel = faktoriyel(n);
        int rFaktoriyel = faktoriyel(r);
        int nMinusRFaktoriyel = faktoriyel(n - r);
        int kombinasyon = nFaktoriyel / (rFaktoriyel * nMinusRFaktoriyel);

        System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
    }

    private static int faktoriyel(int sayi) {
        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }
}
