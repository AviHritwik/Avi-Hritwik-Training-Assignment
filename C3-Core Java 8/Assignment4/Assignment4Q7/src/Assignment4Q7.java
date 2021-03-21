import java.util.HashMap;

public class Assignment4Q7 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Maths",10);
        map.put("English",20);
        map.put("Science",30);
        map.forEach((k,v)-> System.out.println("Key : "+k+" Value : "+v));
        System.out.println("\n**string with all the element of map**");
        System.out.println((new Assignment4Q7()).convertKeyValueToString(map));
    }
    public StringBuilder convertKeyValueToString(HashMap<String, Integer> map) {
        StringBuilder string = new StringBuilder();
        map.forEach((k,v) -> {string.append(k);string.append(v);});
        return string;
    }
}
