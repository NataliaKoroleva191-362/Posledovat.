import java.util.Scanner;
public class Zadacha_136 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;
        int m = 0;
        System.out.println("Введите первый элемент");
        int d = in.nextInt();
            while (true) {
                System.out.println("Введите следующий элемент");
                int x = in.nextInt();
                if (d == x) {
                    n += 1;
                }
                else {
                    n = 1;
                }
                if (m < n) {
                    m = n;
                }
                d = x;
                System.out.println(m);
            }
        }
    }
