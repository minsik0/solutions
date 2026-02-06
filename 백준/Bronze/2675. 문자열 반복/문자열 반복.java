import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        for(int i = 0; i < N; i++){
            int R = sc.nextInt();
            String S = sc.next();
            
            for (int j = 0; j < S.length(); j++){
                char ch = S.charAt(j);
            
                for(int k = 0; k < R; k++){
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
    }
}