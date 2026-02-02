import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int b[] = new int[N + 1];
        
        
        for (int m = 0; m < M; m++) {
            int i = sc.nextInt(); 
            int j = sc.nextInt(); 
            int k = sc.nextInt(); 
            
            for (int index = i; index <= j; index++) {
                b[index] = k; 
            }
        }
        for (int n = 1; n <= N; n++) {
            System.out.print(b[n] + " ");
        }
    }
}