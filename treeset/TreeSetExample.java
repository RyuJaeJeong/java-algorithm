package treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 1; i <= 100; i++) {
            treeSet.add(i);
        }
        System.out.println("first: " + treeSet.first());
        System.out.println("last: " + treeSet.last());
        System.out.println("higher: " + treeSet.higher(2));
        System.out.println("lower: " + treeSet.lower(2));

//        for(int num : treeSet.descendingSet()){
//            System.out.printf("num: %d\n", num);
//        }
//        Iterator<Integer> iter = treeSet.descendingIterator();
//        while(iter.hasNext()){
//            System.out.println("num2: " + iter.next());
//        }
//        SortedSet<Integer> headSet = treeSet.headSet(50);
//        for (int num: headSet){
//            System.out.println("num: " + num);
//        }

//        NavigableSet<Integer> tailSet = treeSet.tailSet(50, true);
//        for (int num: tailSet){
//            System.out.println("num: " + num);
//        }

        NavigableSet<Integer> tailSet = treeSet.subSet(50, true, 60, false);
        for (int num: tailSet){
            System.out.println("num: " + num);
        }
    }
}
