package Collection;

importjava.util.map;

public class DateOfBirth {

    private int date;
    private int month;
    private int year;

    public DateOfBirth(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }
    public setDate(int date){
	this.date = date;
    }
  
    public setMonth(int month){
	this.month = month;
    }

    public setDate(int year){
	this.year = year;
    }  

    @Override
    public int hashCode() {
        int result;
        result = (((date*100)+month)*10000)+year;  
        return result;
    }
    
	//will only check the date and month of the object, not the year
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DateOfBirth other = (DateOfBirth) obj;
        if (date != other.date && month != other.month)
            return false;
        return true;
    }

}