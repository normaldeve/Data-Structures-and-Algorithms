package datastructures.list;

public class MyListMain {
    public static void main(String[] args) {
        MyList<String> stringList = new MyList<>();
        System.out.println("<List 데이터 추가>");
        stringList.add("A");
        System.out.println("stringList = " + stringList);
        stringList.add("P");
        System.out.println("stringList = " + stringList);
        stringList.add("L");
        System.out.println("stringList = " + stringList);
        stringList.add("E");
        System.out.println("stringList = " + stringList);
        System.out.println("<List index 위치 원소 조회>");
        stringList.add(2, "P");
        System.out.println("string = " + stringList);
        String string = stringList.get(1);
        System.out.println("string = " + string);
        System.out.println("<List 원소 제거>");
        stringList.remove(2);
        System.out.println("stringList = " + stringList);

    }
}
