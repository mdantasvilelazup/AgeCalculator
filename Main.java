import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = readString(scanner, "Digite seu nome");

        LocalDate birthday = readBirthday();
        LocalDate today = LocalDate.now();
        scanner.close();

        long age = ChronoUnit.YEARS.between(birthday, today);

        print(name + " tem " + age + " anos de idade");
    }

    static LocalDate readBirthday() {
        Scanner scanner = new Scanner(System.in);
        String year = readString(scanner, "Digite o ano do seu nascimento (YYYY)");
        String month = readString(scanner, "Digite o mês do seu nascimento (MM)");
        String day = readString(scanner, "Digite o dia do seu nascimento (DD)");
        scanner.close();

        String formatted = year + "-" + month + "-" + day;
        LocalDate date = LocalDate.parse(formatted);
        return date;
    }

    static String readString(Scanner scanner, String text) {
        print(text);
        String line = scanner.nextLine();
        return line;
    }
    
    static void print(String string) {
        System.out.println(string);
    }
}
