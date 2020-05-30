package Chapter4;

public class StringFunctions {
    public static void main(String[] args) {
        // Immutable / Can not be changed
        String data = "This is a string.", data1 = data.concat(" This is another string."), name = "Hello", data2 = data.concat(name);
        System.out.println(data);
        System.out.println(data1);
        System.out.println(data2);
        System.out.println("Comparison is " + data.compareTo("This is a string."));
        System.out.println("Length is " + data1.length());
        System.out.println("Equals " + name.equals("hello"));
        System.out.println("Equals ignore case " + name.equalsIgnoreCase("hEllo"));
        System.out.println("Contains " + data.contains("is"));
        System.out.println("Starts with " + data.startsWith("This"));
        System.out.println("Ends with " + data2.endsWith(name));
        System.out.println("Substring " + data.substring(3));
        System.out.println("Substring with ending index " + data.substring(3, 8));
        System.out.println("Substring of substring " + (data.substring(3, 8)).substring(2, 4));
        String[] splitString = data.split(" ");
        System.out.println(splitString[3]);
        System.out.println("Join " + String.join("-", splitString));
        System.out.println("Replace " + data.replace(" ", "-"));
        System.out.println("Index of " + data.indexOf("is", 4));
        System.out.println("Char at " + data.charAt(2));
        String forTrim = " Akshay   .       ";
        System.out.println("Trim " + forTrim.trim());
        System.out.println("Upper case " + name.toUpperCase());
        System.out.println("Lower case " + name.toLowerCase());
        String emptyString = "";
        System.out.println("Empty " + emptyString.isEmpty());
    }
}
