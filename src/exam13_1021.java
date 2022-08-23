import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 꼭 다시 풀어볼 것
public class exam13_1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");
        int size = Integer.parseInt(input[0]);
        int quantity = Integer.parseInt(input[1]);
        int[] num = new int[quantity];

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < quantity; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        LinkedList<Integer> queue = new LinkedList<>();
        for(int i=1; i<=size; i++) {
            queue.offer(i);
        }

        int cnt = 0;

        for (int i=0; i<quantity; i++) {
            int idx = queue.indexOf(num[i]);
            int half;

            if(queue.size() % 2 == 0) {
                half = queue.size() / 2 - 1;
            } else {
                half = queue.size() / 2;
            }

            if (idx <= half) {
                for (int j=0; j<idx; j++) {
                    int temp = queue.pollFirst();
                    queue.offerLast(temp);
                    cnt++;
                }
            } else {
                for (int j=0; j<queue.size() - idx; j++) {
                    int temp = queue.pollLast();
                    queue.offerFirst(temp);
                    cnt++;
                }
            }

            queue.pollFirst();
        }

        System.out.println(cnt);
    }
}
