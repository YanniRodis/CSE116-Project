package ratings.datastructures;

public class LinkedListNode<T> {

    private final T value;
    private LinkedListNode<T> next;

    public LinkedListNode(T val, LinkedListNode<T> next) {
        this.value = val;
        this.next = next;
    }

    public T getValue() {
        return this.value;
    }

    public void setNext(LinkedListNode<T> node) {
        this.next = node;
    }

    public LinkedListNode<T> getNext() {
        return this.next;
    }





}

// linked list edge cases: delete last node, delete first code(HARDER): node stored in instance variable, need to update the value