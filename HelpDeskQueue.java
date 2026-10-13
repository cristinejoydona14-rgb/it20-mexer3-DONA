import java.util.PriorityQueue;
import java.util.Comparator;

class Ticket {
    String name;
    int urgency;
    int arrivalOrder;

    public Ticket(String name, int urgency, int arrivalOrder) {
        this.name = name;
        this.urgency = urgency;
        this.arrivalOrder = arrivalOrder;
    }

    
    public String toString() {
        return name + " (" + urgency + ")";
    }
}

public class HelpDeskQueue {
    public static void main(String[] args) {

        
        PriorityQueue<Ticket> queue = new PriorityQueue<>(
            Comparator.comparingInt((Ticket t) -> t.urgency)
                      .thenComparingInt(t -> t.arrivalOrder)
        );

        
        queue.offer(new Ticket("Printer", 3, 0));
        queue.offer(new Ticket("Network", 1, 1));
        queue.offer(new Ticket("Login", 2, 2));
        
        
        
       
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
            
            
        }
    }
}