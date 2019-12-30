import java.util.Scanner;
public class Zadacha_134 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0,  a, kv=-1 ;
        while (s.hasNextInt()) {
            a = s.nextInt();
            a=(int)Math.pow(a,2);
            if(a!=kv) {
                kv=a;
                i++;
            }
            else {
                i=0;
            }
            System.out.println(i);
        }
        System.out.println(i);
        s.close();
    }
}
