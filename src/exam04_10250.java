import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class exam04_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(bf.readLine());
        Map<Integer, String[]> caseMap = new HashMap<>();

        for(int i=0; i<cases; i++) {
            String[] str = bf.readLine().split(" ");
            caseMap.put(i, str);
        }
        bf.close();

        // 맵에서 꺼내서 계산
        Iterator<Map.Entry<Integer, String[]>> it = caseMap.entrySet().iterator();
        while (it.hasNext()) {
            String[] info = it.next().getValue();

            double height = Double.parseDouble(info[0]);
            double width = Double.parseDouble(info[1]);
            double guest = Double.parseDouble(info[2]);
            int floor;
            int no;

            if (guest % height == 0) {
                floor = (int) height;
                no = (int) (guest / height);
            } else {
                floor = (int) (guest % height);
                no = (int) Math.ceil(guest / height);
            }

            if (no < 10) {
                System.out.println(floor+"0"+no);
            } else {
                System.out.println(""+floor+no);
            }
        }

    }
}
