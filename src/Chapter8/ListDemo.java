package Chapter8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class student{
    private String name;
    private int rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public student() {
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    public student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("First");
        arrayList.add("Third");
        arrayList.add(1,"Second");

        System.out.println("------------------\n");
        for (String s: arrayList) {
            System.out.println(s);
        }
        System.out.println("------------------\n");
        Iterator<String> itr = arrayList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("------------------\n");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("------------------\n");
        //arrayList.remove("First");
        arrayList.remove(1);
        System.out.println(arrayList);
        System.out.println("------------------\n");
        System.out.println("contains Third : "+arrayList.contains("Third"));
        System.out.println("------------------\n");
        System.out.println("Is empty : " + arrayList.isEmpty());
        arrayList.clear();
        System.out.println("After using clear() \nIs empty : " + arrayList.isEmpty());
        System.out.println("------------------ LINKED LIST ------------------\n");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("India");
        linkedList.add("UK");
        linkedList.add("USA");

        System.out.println(linkedList.peek());
        System.out.println(linkedList);
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println("------------------\n");
        System.out.println(linkedList.poll());
        System.out.println(linkedList);
        linkedList.add(0,"India");
        linkedList.add("Nepal");
        System.out.println(linkedList.pollFirst());
        System.out.println("After poll first : "+linkedList);
        System.out.println(linkedList.pollLast());
        System.out.println("After poll last : "+linkedList);
        System.out.println("------------------\n");
        System.out.println(linkedList.pop());
        System.out.println("After pop : "+linkedList);
        System.out.println("------------------\n");
        linkedList.push("India");
        System.out.println("After push : "+linkedList);
        System.out.println("------------------ Custom Object in ArrayList ------------------\n");

        ArrayList<student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new student("Akshay",1));
        studentArrayList.add(new student("Sumit",2));

        studentArrayList.get(0).setName("Akki");

        for (student s : studentArrayList) {
            System.out.println(s.toString());
        }
    }
}
