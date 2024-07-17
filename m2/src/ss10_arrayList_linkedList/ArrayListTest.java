package ss10_arrayList_linkedList;

public class ArrayListTest {
    public static void main(String[] args) {
        MyList list = new MyList();
        System.out.println(list);
        list.add(22, 5);
        list.add(20, 4);
        System.out.println(list);
        System.out.println(list.remove(5));
        System.out.println(list);
        System.out.println(list.indexOf(20));
    }
}
