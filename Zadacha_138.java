import java.util.Scanner;
public class Zadacha_138 {
    public static void main(String[] args) {
        int n = 0;
        int k = 0;
            while (true) {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите элементы последовательности ");
                int x = in.nextInt();
                k += 1;
                if (x == 0 && n == 0) {
                    n = k;
                }
                    System.out.println(n);
                }
            }
        }
