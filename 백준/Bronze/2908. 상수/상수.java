import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int reverseA = Integer.parseInt(new StringBuilder(A).reverse().toString());
        int reverseB = Integer.parseInt(new StringBuilder(B).reverse().toString());

        System.out.println(reverseA > reverseB ? reverseA : reverseB);
    }
}