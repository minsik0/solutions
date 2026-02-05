import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        int arr[] = new int[26];
        
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            int index = ch - 'a';

            if (arr[index] == -1) {
                arr[index] = i;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}