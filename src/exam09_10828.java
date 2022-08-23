import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class exam09_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        List<Integer> stack = new ArrayList<>(num);
        int input = 0;

        for (int i = 0; i < num; i++) {
            String[] command = bf.readLine().split(" ");

            switch (command[0]) {
                case "push":
                    input = Integer.parseInt(command[1]);
                    stack.add(input);
                    break;
                case "top":
                    if (stack.size() != 0) {
                        System.out.println(stack.get(stack.size()-1));
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if (stack.size() != 0) {
                        System.out.println(0);
                    } else {
                        System.out.println(1);
                    }
                    break;
                case "pop":
                    if (stack.size() != 0) {
                        System.out.println(stack.get(stack.size()-1));
                        stack.remove(stack.size()-1);
                    } else {
                        System.out.println(-1);
                    }
                    break;
            }
        }
    }
}
