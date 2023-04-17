import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");

        int a;
        int b;
        float c;
        long vypocet;

        System.out.println("Zadej výší uvěru (v Kč):");
        a = sc.nextInt();
        System.out.println("Zadej délku úvěru (v rocích):");
        b = sc.nextInt();
        System.out.println("Zadej úrokovou sazbu:");
        c = sc.nextFloat();

        Rekurze rekurze = new Rekurze(a, b, c);
        vypocet = rekurze.vypocet();

        rekurze.pocet();
        System.out.println(" ");
        System.out.println("Měšíční splátka: " + vypocet + "Kč");
    }
}