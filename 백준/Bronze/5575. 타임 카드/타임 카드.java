import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int h1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int s1 = Integer.parseInt(st.nextToken());

            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int s2 = Integer.parseInt(st.nextToken());
            
            int startTime = h1 * 3600 + m1 * 60 + s1;
            int endTime = h2 * 3600 + m2 * 60 + s2;
            
            int total = endTime - startTime;
            
            int h = total / 3600;
            int m = (total % 3600) / 60;
            int s = total % 60;
            
            System.out.println(h + " " + m + " " + s);
        }

    }
}