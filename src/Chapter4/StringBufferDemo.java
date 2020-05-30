package Chapter4;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // 16(default)
        sb.append("Akshay is a teacher. hello");
        System.out.println(sb.capacity());  // 16(old capacity) * 2 + 2 = 34
        System.out.println(sb.length());
        sb.insert(20,"Akshay");
        System.out.println(sb);
        sb.replace(0,6,"AKSHAY");
        System.out.println(sb);
        sb.delete(20,32);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
