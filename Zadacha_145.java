import java.util.Scanner;
public class Zadacha_145 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x;
        int c = 0;
        while (true) {
                x = sc.nextInt();
                if (x == 1) {
                    x = sc.nextInt();
                    if (x == 2) {
                        x = sc.nextInt();
                        if (x == 1) {
                            x = sc.nextInt();
                            if (x == 2) {
                                x = sc.nextInt();
                                if (x == 1) {
                                    x = sc.nextInt();
                                    if (x == 2) {
                                        c++;
                                    }
                                }
                            }
                        }
                    }
                }
            System.out.println(c);
        }
    }
}
