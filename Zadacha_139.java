import java.util.Scanner;
public class Zadacha_139 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;
        System.out.println("Введите первый элемент ");
        int d = in.nextInt();
        int m = d;
        System.out.println("Число элементов, больше предыдущего: " + n);
            while (true) {
                System.out.println("Введите следующий элемент ");
                int x = in.nextInt();
                if (x > m) {
                    n += 1;
                }
                m = x;
                System.out.println("Число элементов, больше предыдущего - " + n);
            }
    }
}
