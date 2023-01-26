package com.brideglabz.stacksandqueues;

public class StackMain <T> {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);
        Node<Integer> newNode = Stack.peak();
        Stack.printStack();
        Object Assert = new Object();
        Assert.equals(thirdNode == newNode);
    }
}
