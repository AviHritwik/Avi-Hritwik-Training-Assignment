import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4Q8 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Thread t = new Thread(new ThreadRun(list));
        t.start();
    }
    static class ThreadRun extends Thread{

        List<Integer> list = new ArrayList<Integer>();
        ThreadRun(List<Integer> listArg)
        {
            list=listArg;
        }
        Consumer<List<Integer> > displayList = list -> list.stream().forEach(a -> System.out.print(a + " "));

        public void run() {
            displayList.accept(list);
        }

    }

}
