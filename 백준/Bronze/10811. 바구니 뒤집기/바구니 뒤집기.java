import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[] = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        for (int m = 0; m < M; m++) {
            int i = sc.nextInt(); 
            int j = sc.nextInt(); 

            int start = i;
            int end = j;

            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }
        for (int n = 1; n <= N; n++) {
            System.out.print(arr[n] + " ");
        }
    }
}