import java.util.Scanner;
public class Zadacha_137 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = 1;
        int n2 = 1;
        int min = 1;
        int max = 1;
        System.out.println("Введите первый элемент ");
        int d = in.nextInt();
        int b = d;
            while (true) {
                System.out.println("Введите следующий элемент ");
                int x = in.nextInt();
                n1 += 1;
                n2 += 1;
                if (x > b) {
                    b = x;
                    min = n1;
                    max = n2;
                }
                else if (x == b)
                    max = n2;
                System.out.println("Номер первого максимального элемента - " + min);
                System.out.println("Номер последнего максимального элемента - " + max);
            }
        }
    }
