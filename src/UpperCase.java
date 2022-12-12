import java.util.Locale;
import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next().toUpperCase(Locale.ROOT);
        System.out.println(name);
    }
}
