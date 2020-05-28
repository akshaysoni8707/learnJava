package Chapter4;

import java.util.Arrays;

class DummyArray{
    private String[] data;

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }
}

public class ArrayDemo {
    public static void main(String[] args) {
        int[] marks = {45,65,74};
        System.out.println(marks[0]);
        int[] marks1 = new int[3];
        marks1[0] = 56;
        marks1[1] = 67;
        marks1[2] = 89;
        System.out.println(marks1[2]);
        for (int i = 0; i < marks.length;i++){
            System.out.println(marks[i]);
        }
        for (int i: marks1) {
            System.out.println(i);
        }
        System.out.println(Arrays.toString(marks));

        String[] dataDemo = new String[3];
        for (int i = 0; i < dataDemo.length; i++) {
            dataDemo[i] = "Hello " + (i+1);
        }


        DummyArray d = new DummyArray();
        d.setData(dataDemo);
        System.out.println(Arrays.toString(d.getData()));
    }
}
