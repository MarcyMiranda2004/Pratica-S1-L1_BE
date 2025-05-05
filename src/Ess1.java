import java.util.Scanner;

public class Ess1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // ess 1 - moltiplica
        System.out.println("ess 1");
        System.out.println("Inserisci i numeri da moltiplicare:");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int prodotto = n1 * n2;
        System.out.println("Il prodotto è: " + prodotto);

        scan.nextLine();

        // ess 2 - concatena
        System.out.println("ess 2");
        System.out.println("Inserisci una stringa:");
        String str1 = scan.nextLine();

        System.out.println("Inserisci un numero intero:");
        int n3 = scan.nextInt();

        scan.nextLine();

        String elementi = "";
        for (int i = 0; i < n3; i++) {
            elementi += str1;
        }

        System.out.println("Risultato: " + elementi);

        // ess 3 - array
        System.out.println("ess 3");
        String[] array = new String[] {"uno", "due", "tre", "quattro", "cinque"};

        String[] newArray = new String[6];

        System.out.println("inserisci una stringa");
        String str2 = scan.nextLine();

        newArray[0] = array[0];
        newArray[1] = array[1];
        newArray[2] = str2;
        newArray[3] = array[2];
        newArray[4] = array[3];
        newArray[5] = array[4];

        System.out.println("Nuovo Array:");
        for (String printNewArray : newArray) {
            System.out.println(printNewArray);
        }

        scan.close();
    }
}
