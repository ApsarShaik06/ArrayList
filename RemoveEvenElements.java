import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add(value) --> Append value at end of list.

        list.add(1);
        list.add(20);
        list.add(3);
        list.add(13);
        list.add(5);
        list.add(43);

        System.out.println(list);

        // add(index, value) --> Appending a value at specified index value

        list.add(0, 40);

        System.out.println(list);

        // size() --> to fetch the size of the given arraylist
        list.size();

        // Removing even elements from the arrayList.
        System.out.println(RemoveEvenElements(list));
    }

    public static String RemoveEvenElements(ArrayList<Integer> list) {

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        String s = list.toString();
        return s;
    }
}
