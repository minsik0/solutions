import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int youngsik = 0;
        int minsik = 0;
        
        for (int i = 0; i < N; i++) {
            int time = Integer.parseInt(st.nextToken());
            

            youngsik += ((time / 30) + 1) * 10;
            minsik += ((time / 60) + 1) * 15;
        }
        if (youngsik < minsik) {
            System.out.println("Y " + youngsik);
            
        } else if (minsik < youngsik) {
            System.out.println("M " + minsik);
            
        } else {
            System.out.println("Y M " + youngsik);
        }
    }
}