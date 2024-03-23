package IntroToArrayList;

import java.util.ArrayList;

public class IntroArrayList {
    public static void ArrayListIntroduction () {
        // Arraylist is like vector in c++ a dynamic array which grows
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " -> " + list.size());
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list + " -> " + list.size());

        // Traversing Approach 1:
        //        for (int i = 0 ; i < list.size() ; i++) {
        //            int num = list.get(i);
        //            System.out.println(num);
        //        }

        // replace value using set helper function
        list.set(2, 300);
        list.add(2, 69);

        // Traversing Approach 2:
        for (int val : list) {
            System.out.print(val + " ");
        }
    }
}
