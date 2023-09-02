package lec27;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.isEmpty());

        list.add("first");
        list.add("second");

        for (String string : list) {
            System.out.println(string);
        }

        ArrayList<String> list1  = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        for (String str : list1) {
            System.out.println(str);
        }

        list.remove("first");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i " + i + " item " + list.get(i));
        }

        System.out.println(list.contains("second")); // true

        //
        System.out.println();

        list.add(0, "third");
        list.add("fourth");
        System.out.println(list.size() - 1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i " + i + " item " + list.get(i));
        }

        // Convert to array.
        String[] array = new String[list.size()];
        list.toArray(array);

        //
        System.out.println();

        List<String> big = new ArrayList<>();
        big.add("big");
        big.addAll(list);
        for (String string : big) {
            System.out.println(string + " ");
        }

        //
        System.out.println();

        List<String> list2 = new ArrayList<>();
        list2.add("first");
        list2.add("second");
        list2.add("third");
        list2.add("first");
        list2.add("so");
        System.out.println(list2.indexOf("first"));             // 0
        System.out.println(list2.lastIndexOf("first"));      // 3

        //
        System.out.println();

        list2.clear();
        list2.add("new item");
        for (String str : list2) {
            System.out.println(str);
        }

        //
        System.out.println("----LIST 3");

        List<String> list3 = new ArrayList<>();
        list3.add("first");
        list3.add(null);
        list3.set(0, "second"); // set
        for (String str : list3) {
            System.out.println(str);
        }

        //
        System.out.println("----LIST Sorted");

        List<String> listSorted = new ArrayList<>();
        listSorted.add("first");
        listSorted.add("1");
        listSorted.add("23");
        listSorted.add("second");
        listSorted.add("234");
        listSorted.sort(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.length() - t1.length();
            }
        });

        for (String str : listSorted) {
            System.out.println(str);
        }
    }
}
