import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class exam06_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bf.readLine());

        if (number < 10) number *= 10;

        int first = 0;
        int second = 0;
        int sum = 0;
        int newNum = number;
        List<Integer> list = new ArrayList<>();

        while (true) {
            first = newNum / 10;
            second = newNum % 10;
            sum = first + second;
            newNum = second*10 + (sum % 10);

            if (newNum == number) break;
            list.add(newNum);
        }

        System.out.println(list.size()+1);
    }
}
