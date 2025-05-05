import java.util.Scanner;

public class Ess3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Rettangolo
        System.out.println("Inserisci il primo lato:");
        double lato1 = scan.nextDouble();

        System.out.println("Inserisci il secondo lato:");
        double lato2 = scan.nextDouble();

        double perimetro = (lato1 + lato2) * 2;
        System.out.println("Il perimetro è: " + perimetro);

        // Pari e Dispari
        System.out.println("Inserisci un numero:");
        int numero = scan.nextInt();

        paridispari(numero);

        // Triangolo
        System.out.println("Inserisci il primo lato del triangolo:");
        double a = scan.nextDouble();

        System.out.println("Inserisci il secondo lato del triangolo:");
        double b = scan.nextDouble();

        System.out.println("Inserisci il terzo lato del triangolo:");
        double c = scan.nextDouble();

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("L'area del triangolo è: " + area);

        scan.close();
    }

    public static int paridispari(int n) {
        if (n % 2 == 0) {
            System.out.println("Il numero è pari");
            return 0;
        } else {
            System.out.println("Il numero è dispari");
            return 1;
        }
    }

    public static boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
