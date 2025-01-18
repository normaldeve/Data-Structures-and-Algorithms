package datastructures.list.linked;

public class MyLinkedListMain {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("A");
        System.out.println(linkedList);
        linkedList.add("P");
        System.out.println(linkedList);
        linkedList.add("L");
        System.out.println(linkedList);
        linkedList.add("E");
        System.out.println(linkedList);
        linkedList.add(2, "P");
        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);

        linkedList.set(2, "PL");
        System.out.println(linkedList);
    }
}
