import java.util.PriorityQueue;
import java.util.Queue;
public class LearnPriorityQueue{
    public static void main(String[] args) {
        
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(234);
        pq.offer(56);
        pq.offer(90);
        pq.offer(543);

        System.out.println(pq);
    }
}