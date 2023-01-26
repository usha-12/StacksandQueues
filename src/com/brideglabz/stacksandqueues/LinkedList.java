package com.brideglabz.stacksandqueues;

public class LinkedList <T> {
    public Node<T> head;
    public Node<T> tail;

    public void push(T data) {
        Node<T> newMyNode = new Node(data);
        if (head == null) {
            head = newMyNode;
            tail = newMyNode;
        } else {
            newMyNode.setNext(head);
            head = newMyNode;
        }
    }

    public void add(T data) {
        Node<T> newMyNode = new Node(data);
        if (head == null) {
            head = newMyNode;
            tail = newMyNode;
        } else {
            tail.setNext(newMyNode);
            tail = newMyNode;
        }
    }

    public void show() {
        if (head == null) {
            System.out.println("Linked list is Empty");
        } else {
            Node<T> temp = head;
            while (temp != null) {
                System.out.print(temp.getKey() + " ");
                temp = (Node<T>) temp.getNext();
            }
            System.out.println();
        }

    }

    public boolean isEmpty() {
        return head == null ? true : false;
    }

    public T pop() {
        if (head == null)
            return null;
        else {
            T data = head.getKey();
            head = (Node<T>) head.getNext();
            return data;
        }
    }

    public T popLast() {
        if (head == null)
            return null;
        else {
            Node<T> temp = head;
            while (temp.getNext() != tail) {
                temp = (Node<T>) temp.getNext();
            }
            T data = tail.getKey();
            temp.setNext(null);
            tail = temp;
            return data;
        }
    }


    public Node<T> search(T searchData) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.getKey().equals(searchData))
                return temp;
            temp = (Node<T>) temp.getNext();
        }
        return null;
    }

    public boolean searchAndInsert(T searchData, T insertData) {
        Node<T> newMyNode = new Node(insertData);
        Node<T> searchedMyNode = search(searchData);
        if (searchedMyNode == null)
            return false;
        else {
            newMyNode.setNext(searchedMyNode.getNext());
            searchedMyNode.setNext(newMyNode);
            return true;
        }

    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head + '}';
    }
}
