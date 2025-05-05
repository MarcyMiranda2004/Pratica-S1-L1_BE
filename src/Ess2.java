import java.util.Scanner;

public class Ess2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci la prima stringa");
        String str1 = scan.nextLine();

        System.out.println("inserisci la seconda stringa");
        String str2 = scan.nextLine();

        System.out.println("inserisci la terza stringa");
        String str3 = scan.nextLine();

        System.out.println(str1 + str2 + str3);
        System.out.println(str3 + str2 + str1);

        scan.close();
    }
}
