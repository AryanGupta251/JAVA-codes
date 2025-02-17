import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
//        Syntax...........
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(12);
        list.add(132);
        list.add(1232);
        list.add(12089);
        list.add(13781);
        list.add(1337);
        list.add(11893);
        System.out.println(list.contains(929428));
        System.out.println(list);
        list.set(0,38);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);









    }
}
