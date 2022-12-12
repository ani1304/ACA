import java.util.Scanner;

public class NumAngamAnun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.next();
        int Num = scanner.nextInt();
        String Num1 = (Name + Num);
        while (Num!=0) {
            System.out.println(Name);
            Num--;
        }
    }
}
