

public class Labour extends Assignment2Q2{
    private int overtime;
    public Labour()
    {
        overtime = 500;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + overtime;
    }


}
