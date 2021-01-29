public class Manager extends Assignment2Q2{
    private int incentive;
    public Manager()
    {
        incentive=5000;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + incentive;
    }
}
