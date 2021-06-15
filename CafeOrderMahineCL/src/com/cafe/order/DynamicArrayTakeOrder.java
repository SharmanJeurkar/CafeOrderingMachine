package com.cafe.order;

public class DynamicArrayTakeOrder {
    int capacity = 1;
    String[] takeOrder = new String[capacity];
    int top = 0;


    public void push(String order) {
        if (size() == capacity)
            expand();
        takeOrder[top] = order;

        top++;

    }

    private void expand() {
        int length = size();
        String[] dArray = new String[capacity + 1];
        System.arraycopy(takeOrder, 0, dArray, 0, length);
        takeOrder = dArray;
        capacity += 1;

    }

    public String pop() {
        String order;
        top--;
        order = takeOrder[top];
        takeOrder[top] = null;
        return order;
    }

    public String peek() {

        String order;
        order = takeOrder[top - 1];

        return order;
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public void show() {
        ShowArray array = new ShowArray();
        array.showArray(takeOrder);
    }

}
