import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        double sum = 0;
        double max = 0;
        
        for(int i = 0; i < N; i++){
            int score = sc.nextInt();
            
            sum += score;
            if(score > max){
                max = score;
                
            }
        }
        double avg = (sum * 100.0) / max / N;
        System.out.println(avg);
    }
}