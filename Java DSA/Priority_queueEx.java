import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Priority_queueEx {
    public static void main(String[] args) {
        PriorityQueue<int[]> pq = new PriorityQueue<>();

        int arr[] = { 1, 4, 2, 2, 4, 4, 4, 1, 1, 67, 67, 12, 345 };

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : arr)
            map.put(a, map.getOrDefault(a, 0) + 1);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int res[] = { entry.getValue(), entry.getKey() };
            pq.add(res);
        }

        // while (!pq.isEmpty()) {
        // System.out.print(pq.poll() + " ");
        // }
    }
}
