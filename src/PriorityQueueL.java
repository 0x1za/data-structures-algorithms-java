import java.util.PriorityQueue;

public class PriorityQueueL {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(100);
        numbers.add(102);
        numbers.add(12);
        numbers.add(45);

        while (!numbers.isEmpty()) {
            System.out.println(numbers.remove());
        }

    }
}
