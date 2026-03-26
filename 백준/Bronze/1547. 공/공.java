import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int b = 1;
        
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if (x == b) {
                b = y;
            } else if (y == b) {
                b = x;
            }
        }
        System.out.println(b);
    }
}