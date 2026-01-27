import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();   
        int M = sc.nextInt();    
        int T = sc.nextInt();    

        M = H * 60 + M;
        M = M + T;

        H = (M / 60) % 24;       
        int min = M % 60;        

        System.out.println(H + " " + min);

    }
}