import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.next();
        int age = scanner.nextInt();
        System.out.println("Hello" + " " + Name + " " + age);
    }

}
