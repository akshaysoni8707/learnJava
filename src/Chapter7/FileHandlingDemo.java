package Chapter7;

import java.io.*;
import java.util.Scanner;

public class FileHandlingDemo {
    public void FileStringWriter(File f, String data) throws IOException {
        FileOutputStream fout = new FileOutputStream(f);
        DataOutputStream dataOutputStream = new DataOutputStream(fout);
        String s = data;
        byte[] b = s.getBytes();
        dataOutputStream.write(b);
        dataOutputStream.close();
        fout.close();
    }
    public String FileStringReader(File f) throws IOException {
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
    public void FileStringWriterLite(File f, String data) throws IOException {
        FileWriter fileWriter = new FileWriter(f);
        fileWriter.write(data);
        fileWriter.close();
    }
    public String FileStringReaderLite(File f) throws IOException {
        StringBuilder sb = new StringBuilder();
        FileReader fileReader = new FileReader(new File("demo1.txt"));
        Scanner sc = new Scanner(fileReader);
        while (sc.hasNextLine()){
            sb.append(sc.nextLine());
        }
        fileReader.close();
        return sb.toString();
    }
}
