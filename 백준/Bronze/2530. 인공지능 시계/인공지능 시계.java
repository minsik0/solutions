import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); 
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(br.readLine());
        
        long total = (long) a * 3600 + b * 60 + c + d;
        
        long hour = (total / 3600) % 24;
        long minute = (total % 3600) / 60;
        long second = total % 60;

        System.out.println(hour + " " + minute + " " + second);
    }
}