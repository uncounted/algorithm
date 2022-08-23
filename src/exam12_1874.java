import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class exam12_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int popNum = 1;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i < num; i++) {
            int input = Integer.parseInt(bf.readLine());

            while(popNum <= input) {
                stack.push(popNum);
                sb.append("+").append("\n");
                popNum += 1;
            }

            if (stack.peek() == input) {
                stack.pop();
                sb.append("-").append("\n");
            } else {
                sb.delete(0, sb.length());
                sb.append("NO");
                break;
            }
        }

        System.out.println(sb);
    }
}
