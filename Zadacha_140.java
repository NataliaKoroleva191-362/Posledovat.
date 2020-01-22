import java.util.Scanner;
public class Zadacha_140 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0, k = 0, max = 0;
        while (in.hasNextInt()) {
            a = in.nextInt();
            if (a>max) {
                k = max;
                max = a;
            }
            if (a>k & a<max) k = a;
            System.out.println(k);
        }
    }
}
