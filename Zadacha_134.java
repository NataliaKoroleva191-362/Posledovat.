import java.util.HashSet;
import java.util.Random;
public class Zadacha_134 {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < 9; i++) {
            int a = random.nextInt(9)-4;
            System.out.println(a);
            set.add(a*a);
        }
        System.out.println("Количество различных квадратов: " + set.size());
    }
}
