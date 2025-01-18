package datastructures.list.linked;

import datastructures.list.MyList;

public class MyLinkedList<E> implements MyList<E> {
    private Node<E> head;
    private int size = 0;

    @Override
    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = head;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    @Override
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<E> prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    @Override
    public E set(int index, E element) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    @Override
    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;
        if (index == 0) {
            head = removeNode.next;
        } else {
            Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }

    @Override
    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = head;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    @Override
    public int indexOf(E o) {
        int index = 0;
        for (Node<E> x = head; x != null; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }
}
