import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("podaj imię:");
        String name = scanner.nextLine();
        System.out.print("podaj nazwisko:");
        String surname = scanner.nextLine();
        System.out.print("podaj wiek:");
        int age = scanner.nextInt();

        if (age > 18) {
            System.out.printf(MessageFormat.format("Cześć, {0} {1}, jesteś pełnoletni", name, surname));


        }else{
            System.out.printf(MessageFormat.format("Cześć, {0} {1}, nie masz wstępu młody", name, surname));

            }
        }
    }
