package com.brideglabz.stacksandqueues;

public class Stack <T> {
    private static LinkedList<T> LinkedList;

    public Stack() {
        LinkedList = new LinkedList<>();
    }
    public void push (Node<T> element){
        LinkedList.add((T) element);
    }
    public Node<T> peak(){
        return LinkedList.head;

    }
    public Node<T> pop(){
        return (Node<T>) LinkedList.pop();
    }
    public static void printStack(){
        LinkedList.show();
    }
}

/*Ability to peak and
pop from the Stack
till it is empty
56
->30
->70
- Use LinkedList to do the Stack
Operations*/