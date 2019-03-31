import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueL {
    public static void main(String[] args) {
        Comparator<String> stringLengthComparator = (o1, o2) -> o2.length() - o1.length();

        // Create priority queue.
        PriorityQueue<String> stringQueue = new PriorityQueue<>(stringLengthComparator);


        // Add item to the priority queue.
        stringQueue.add("Mwiza");
        stringQueue.add("Simbeye");

        while (!stringQueue.isEmpty()){
            System.out.println(stringQueue.remove());
        }
    }
}
