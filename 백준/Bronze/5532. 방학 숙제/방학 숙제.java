import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int L = Integer.parseInt(br.readLine()); 
        int A = Integer.parseInt(br.readLine()); 
        int B = Integer.parseInt(br.readLine()); 
        int C = Integer.parseInt(br.readLine()); 
        int D = Integer.parseInt(br.readLine());
        int ko = 0;
        int math = 0;
        
        if(A % C == 0){
            ko = L - (A / C);
        }else{
            ko = L - (A / C + 1);
        }

        if(B % D == 0){
            math = L - (B / D);
        }else{
            math = L - (B / D + 1);
        }
        
        System.out.println(Math.min(ko, math));
    }
}