package datastructures.list;

import datastructures.list.array.MyArrayList;
import datastructures.list.linked.MyLinkedList;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        //MyLinkedList<Integer> list = new MyLinkedList<>();

        BatchProcessor processor = new BatchProcessor(list);
        processor.simpleLogic(100_000);
    }
}
