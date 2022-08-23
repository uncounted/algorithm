import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class exam14_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] answer = new String[num];
        LinkedList<Boolean> list = new LinkedList<>();

        for(int i=0; i<num; i++) {
            String[] ps = br.readLine().split("");
            int cnt = 0;

            if (ps[0].equals(")") || ps.length % 2 != 0) {
                answer[i] = "NO";
            } else {
                for (String p : ps) {
                    if (p.equals("(")) {
                        list.add(true);
                        cnt++;
                    } else {
                        list.pollLast();
                        cnt--;
                    }
                }
                if (list.size()==0 && cnt == 0) {
                    answer[i] = "YES";
                } else {
                    answer[i] = "NO";
                }
            }
            list.clear();
        }

        for(String a:answer) {
            System.out.println(a);
        }
    }
}
