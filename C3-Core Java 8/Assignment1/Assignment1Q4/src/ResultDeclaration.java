public class ResultDeclaration {
    private int subject1Marks;
    private int subject2Marks;
    private int subject3Marks;

    public ResultDeclaration(int marksSub1,int marksSub2, int marksSub3)
    {
        this.subject1Marks=marksSub1;
        this.subject2Marks=marksSub2;
        this.subject3Marks=marksSub3;
    }

    public String resultCalculate()
    {
        int count=0;
        if(subject1Marks>60)
            count++;
        if(subject2Marks>60)
            count++;
        if(subject3Marks>60)
            count++;
        if(count==3)
            return "passed";
        else if(count==2)
            return "promoted";
        else
            return "failed";
    }
}
