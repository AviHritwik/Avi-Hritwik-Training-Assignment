package Assignment3Q8_2;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Assignment3Q8b {
    public static CopyOnWriteArrayList<Integer> failFast(CopyOnWriteArrayList<Integer> list){
    	list.add(12);
    	list.add(10);
    	list.add(5);
    	Iterator itr = list.iterator(); 
        while (itr.hasNext()) { 
            Integer number = (Integer)itr.next(); 
            System.out.println(number);
                list.add(14); 
        } 
    	
    	return list;
    }
    public static void main(String args[]) {
    	CopyOnWriteArrayList<Integer> copyOnWriteArrayList1 = new CopyOnWriteArrayList<Integer>();
    	CopyOnWriteArrayList<Integer> copyOnWriteArrayList2 = failFast(copyOnWriteArrayList1);
    	
    	Iterator itr = copyOnWriteArrayList2.iterator(); 
        while (itr.hasNext()) { 
            Integer number = (Integer)itr.next(); 
            System.out.println(number);
                 
        } 
    }
}