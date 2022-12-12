import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int k = scanner.nextInt();
        int min;
        if (x+y+z+k==0) {
            if (x < y && y < z && z < k) {
                min = x;
            } else if (y < z && z < k) {
                min = y;
            } else if (z < k) {
                    min = z;
                }
        else {
            min = k;
            }
            System.out.println(min);
        }
    }
}
