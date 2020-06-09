package Chapter8;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(123);
        Integer[] intArr = {12, 65, 34};
        integerHashSet.addAll(Arrays.asList(intArr));
        System.out.println(integerHashSet);
        System.out.println("----------------------\n");
        System.out.println("Contains 65 : " + integerHashSet.contains(65));
        System.out.println("----------------------\n");
        for (Integer i : integerHashSet) {
            System.out.println(i);
        }
        System.out.println("----------------------\n");
        Iterator<Integer> iterator = integerHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----------------------\n");
        integerHashSet.remove(123);
        System.out.println("After removing 123 : " + integerHashSet);
        System.out.println("---------------------- LINKED HASH SET ----------------------\n");
        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();
        stringLinkedHashSet.add("India");
        stringLinkedHashSet.add("USA");
        stringLinkedHashSet.add("UK");
        System.out.println(stringLinkedHashSet);

        LinkedHashSet<String> stringLinkedHashSet1 = new LinkedHashSet<>();
        stringLinkedHashSet1.add("USA");
        stringLinkedHashSet1.add("Nepal");
        stringLinkedHashSet.retainAll(stringLinkedHashSet1);
        System.out.println("After Intersection : " + stringLinkedHashSet);

        System.out.println("----------------------\n");
        stringLinkedHashSet.add("India");
        stringLinkedHashSet.add("USA");
        stringLinkedHashSet.add("UK");
        System.out.println(stringLinkedHashSet);
        stringLinkedHashSet.addAll(stringLinkedHashSet1);
        System.out.println("After Union : " + stringLinkedHashSet);

        System.out.println("---------------------- TREE SET ----------------------\n");
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(123);
        integerTreeSet.addAll(Arrays.asList(intArr));
        System.out.println(integerTreeSet);
        System.out.println("----------------------\n");
        System.out.println("First : " + integerTreeSet.first());
        System.out.println("Last : " + integerTreeSet.last());
        System.out.println("----------------------\n");
        Iterator<Integer> integerIterator = integerTreeSet.descendingIterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
    }
}
