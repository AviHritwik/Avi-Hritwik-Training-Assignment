package Assignment3Q5;

import java.util.Map;

public class Employee {

    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName(){
	return this.name;
    }
    
    public String getId(){
	return this.id;
    }

    public void setName(String name){
	this.name=name;
    }
    
    public void getId(int id){
	this.id=id;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }

        if(obj == null || obj.getClass()!=this.getClass()){
            return false;
        }

    Employee emp = (Employee) obj;

        return (emp.name.equals(this.name) && emp.id ==this.id);
    }


    @Override
    public int hashCode() {

        return this.id;

    }
}