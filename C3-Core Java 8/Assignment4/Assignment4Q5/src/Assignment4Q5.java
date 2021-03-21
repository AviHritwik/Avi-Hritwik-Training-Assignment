import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4Q5 {
    static List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    public static void main(String[] args) {
        System.out.println(Assignment4Q5.processWords(Assignment4Q5.list));
    }

    public static StringBuilder processWords(List<String> list) {
        StringBuilder string=new StringBuilder();
        Consumer<List<String>> makeString= (names->names.stream().forEach(name -> string.append(name.charAt(0))));
        makeString.accept(list);
        return string;
    }
}