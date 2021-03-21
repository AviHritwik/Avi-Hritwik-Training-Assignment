import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Assignment4Q6 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Hindi");
        list.add("English");
        list.add("Science");
        list.add("Sanskrit");
        list.add("Physics");
        list.add("Chemistry");
        System.out.println("List : \n"+list);
        list=(new Assignment4Q6()).convertToUpperCase(list);
        System.out.println("List after modifying : \n"+list);
    }
    public List<String> convertToUpperCase(List<String> list) {
        UnaryOperator<String> upper= string -> string.toUpperCase();
        list.replaceAll(e->upper.apply(e));
        return list;
    }
}

