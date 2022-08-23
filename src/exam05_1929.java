import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class exam05_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] cases = bf.readLine().split(" ");
        int M = Integer.parseInt(cases[0]);
        int N = Integer.parseInt(cases[1]);
        int[] prime = new int[N+1];
        Arrays.fill(prime, 0);

        for (int i=2; i < N; i++) {
            for (int j=2; i*j <= N; j++) {
                prime[i*j] = 1;
            }
        }

        for(int i=M; i<=N; i++){
            if(prime[i] != 1 && i != 1 && i!=2) System.out.println(i);
        }
    }
}
