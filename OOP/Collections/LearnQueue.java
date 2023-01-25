import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class LearnQueue{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        /*
         * Queue is an interface
         * LinkedList is a class that implements the Queue interface
         */
        q.offer(1);
        q.offer(2);
        q.offer(3);
        //Alternative of offer() is add(), add() throws an exception if element is not successfully added while offer() will not

        System.out.println(q.poll());
        //Alternative of poll() is remove(), remove() throws an exception if queue is empty while poll() returns null in this case
        
        System.out.println(q.peek());
        //Alternative of peek() is element(), element() throws an exception when queue is empty while peek() returns null in this case
        System.out.println(q);


        List<Integer>list=new LinkedList<>();
        //This is LinkedList class implementing the List interface
        //This will also work just fine

    }
}