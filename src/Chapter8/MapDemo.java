package Chapter8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, String> contactMap = new HashMap<>();
        contactMap.put("Akshay", "9265406545");
        contactMap.put("Sumit", "95195XXXXX");
        contactMap.putIfAbsent("Sumit", "9XXXXXXXXXX");
        System.out.println("-----------------------------\n");
        System.out.println("Is Akshay present as key : " + contactMap.containsKey("Akshay"));
        System.out.println("-----------------------------\n");
        System.out.println("Is 9265406545 present as value : " + contactMap.containsValue("9265406545"));
        contactMap.replace("Chinmay", "0123456789");
        System.out.println("-----------------------------\n");
        System.out.println("Get Sumit : " + contactMap.get("Sumit"));
        System.out.println("-----------------------------\n");
        System.out.println(contactMap);
        System.out.println("-----------------------------\n");
        for (Map.Entry m: contactMap.entrySet()){
            System.out.println("Key : " + m.getKey() + " value : " + m.getValue());
        }
        System.out.println("-----------------------------\n");
        Set<Map.Entry<String,String>> entries = contactMap.entrySet();
        for (Map.Entry<String, String> s:entries) {
            System.out.println("Key : " + s.getKey() + " value : " + s.getValue());
        }
        System.out.println("-----------------------------\n");
        Set<String> keys = contactMap.keySet();
        for (String key :keys) {
            System.out.println("Key : " + key + " value : " + contactMap.get(key));
        }
    }
}
