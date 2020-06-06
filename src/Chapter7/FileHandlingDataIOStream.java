package Chapter7;

import java.io.*;
import java.util.Scanner;

class WriteStringInFile {
    void fileStringWriter(File f, String data) throws IOException {
        FileOutputStream fout = new FileOutputStream(f);
        DataOutputStream dataOutputStream = new DataOutputStream(fout);
        String s = data;
        byte[] b = s.getBytes();
        dataOutputStream.write(b);
        dataOutputStream.close();
        fout.close();
    }
}

class ReadStringFromFile {
    String fileStringReader(File f) throws IOException {
        StringBuilder sb = new StringBuilder();
        FileInputStream fin = new FileInputStream(f);
        DataInputStream dataInputStream = new DataInputStream(fin);
        int i = 0;
        while ((i = dataInputStream.read()) != -1) {
            sb.append(( char ) i);
        }
        dataInputStream.close();
        fin.close();
        return sb.toString();
    }
}


public class FileHandlingDataIOStream {
    public static void main(String[] args) throws IOException {
        new WriteStringInFile().fileStringWriter(new File("demo.txt"), "My name is Akshay.");
//        String s = new ReadStringFromFile().fileStringReader(new File("demo.txt"));
//        System.out.println(s);
        System.out.println(new ReadStringFromFile().fileStringReader(new File("demo.txt")));

        FileWriter fileWriter = new FileWriter(new File("demo1.txt"));
        fileWriter.write("This is Akshay");
        fileWriter.close();

        FileReader fileReader = new FileReader(new File("demo1.txt"));
        Scanner sc = new Scanner(fileReader);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        fileReader.close();
    }
}
