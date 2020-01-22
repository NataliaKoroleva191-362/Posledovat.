import java.util.Scanner;
public class Zadacha_135 {
    public static void main(String[] args) {
        double s = 0;
        int n = 0;
            while (true) {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите элементы последовательности ");
                double x = in.nextDouble();
                s += x;
                n += 1;
                System.out.println(s / n);
            }
        }
    }
