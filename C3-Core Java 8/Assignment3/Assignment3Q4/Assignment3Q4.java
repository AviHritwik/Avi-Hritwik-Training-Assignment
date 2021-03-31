package Collection;

import java.util.HashMap;

public class Assignment3Q4 {

    public String getEmployee(HashMap<DateOfBirth, String> hm, DateOfBirth dob){

        HashMap<DateOfBirth, String> newMap = new HashMap<>();
        newMap.putAll(hm);
        System.out.println(newMap.get(dob));
    }



    public static void main(String[] args) {

    DateOfBirth ob = new DateOfBirth(01,05,1973);
    DateOfBirth ob1 = new DateOfBirth(21,08,1993);
    DateOfBirth ob2 = new DateOfBirth(17,12,2001);
    DateOfBirth  ob3 = new DateOfBirth(01,05,1998);

    HashMap<DateOfBirth, String> mapKey = new HashMap<>();
    Assignment3Q4 object = new Assignment3Q4();

    mapKey.put(ob, "Employee1");
    mapKey.put(ob1, "Employee2");
    mapKey.put(ob2, "Employee 3");
    mapKey.put(ob3, "Employee 4");

    
    String answer = object.getEmployee(mapKey,new DateOfBirth(17,12,2001));

    System.out.println(answer);

    }
}