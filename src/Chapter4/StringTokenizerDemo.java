package Chapter4;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("This is a string."," ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
