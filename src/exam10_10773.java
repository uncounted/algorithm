import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class exam10_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        int input = 0;
        Stack<Integer> stack = new Stack<Integer>();

        for (int i=0; i < num; i++) {
            input = Integer.parseInt(bf.readLine());
            if (input != 0) {
                stack.push(input);
            } else {
                stack.pop();
            }
        }

        int sum = 0;
        int size = stack.size();
        if (!stack.empty()) {
            for (int i=0; i < size; i++) {
                sum += stack.pop();
            }
        }

        System.out.println(sum);
    }
}
