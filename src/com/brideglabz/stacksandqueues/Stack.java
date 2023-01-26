package com.brideglabz.stacksandqueues;

public class Stack <T> {
    private static LinkedList<T> LinkedList;

    public Stack() {
        LinkedList = new LinkedList<>();
    }
    public void push (Node<T> element){
        LinkedList.add((T) element);
    }
    public static Node<T> peak(){
        return LinkedList.head;

    }
    public Node<T> pop(){
        return (Node<T>) LinkedList.pop();
    }
    public static void printStack(){
        LinkedList.show();
    }
}
