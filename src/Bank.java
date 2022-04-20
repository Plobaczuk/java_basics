import java.util.Random;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();


        int stan = r.nextInt(10001) ;
        System.out.println("1-Wypłać pieniądze");
        System.out.println("2-Wypłać pieniądze");
        System.out.println("3-Sprawdz saldo");
        int a = scanner.nextInt();
        if (a == 123) {
            int b = scanner.nextInt();
            switch (b) {
                case 1 -> {
                    System.out.println("Podaj kwotę do wypłacenia");
                    int c = scanner.nextInt();
                    if (c <= stan) {
                        System.out.println("Proszę odebrać pieniądze o wartości " + c + "zł");
                    } else
                        System.out.println("Brak wystarczających środków na koncie");
                }
                case 2 -> {
                    System.out.println("Podaj kwotę do wpłacenia");
                    int d = scanner.nextInt();
                    System.out.println("Na konto wpłacono " + d + "zł");
                }
                case 3 ->  System.out.println("Stan konta:" + stan + "zł");
                default -> System.out.println("Nie rozpoznano polecenia.");
            }
        } else
            System.out.println("PAPA");
    }
}
