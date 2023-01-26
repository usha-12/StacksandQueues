package com.brideglabz.stacksandqueues;

public class QueueOperation {
    public static void main(String[] args) {
        Queues<Integer> queue = new Queues<Integer>(3);

        System.out.println("Creating the Queue of 56->30->70");
        queue.enqueue(56);
        queue.printQueue();
        queue.enqueue(30);
        queue.printQueue();
        queue.enqueue(70);
        queue.printQueue();
    }
}
/*Ability to create a Queue of
56->30->70
- Use LinkedList to do the Queue
Operations
- Here enqueue will internally call append
method on LinkedList.
- So 56 will be added first then 30 and
then 70 to make 56 on top of the Stack*/

