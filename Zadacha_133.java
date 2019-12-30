import java.util.Scanner;
public class Zadacha_133 {
    public static void main(String[] args) {
        int min = Integer.MIN_VALUE;
        int n = 0;
            while (true) {
                Scanner in = new Scanner(System.in);
                int x = in.nextInt();
                if (x > min) {
                    min = x;
                    n = 1;
                }
                else if (min == x)
                    n += 1;
                System.out.println(n);
            }
        }
}
