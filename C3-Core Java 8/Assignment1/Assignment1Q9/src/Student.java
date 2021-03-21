class Student {
    private int subjectA;
    private int subjectB;
    private int subjectC;

    public Student(int subjectA,int subjectB,int subjectC)
    {
        this.subjectA=subjectA;
        this.subjectB=subjectB;
        this.subjectC=subjectC;
    }

    public Student() {
    }

    public int studentsTotalMarksInAllSubjects(Student[] students) {
        int total=0;
        for(int i=0;i<3;i++)
        {
            total+=(students[i].subjectA+students[i].subjectB+students[i].subjectC);
        }
        return total;
    }



    public double studentsAverageMarksInAllSubjects(Student[] students) {
        int total=this.studentsTotalMarksInAllSubjects(students);
        double avg=total/3;
        return avg;
    }
    public int[] subjectWiseMarks(Student[] students,String subjectName) {
        int[] subjectWise = new int[3];
        subjectName=subjectName.toLowerCase();
        if (subjectName.equals("subjecta")){
            for (int i = 0; i < 3; i++)
                subjectWise[i] = students[i].subjectA;
        }
        else if(subjectName.equals("subjectb")) {
            for (int i = 0; i < 3; i++)
                subjectWise[i] = students[i].subjectB;
        }
        else if(subjectName.equals("subjectc")) {
            for(int i=0;i<3;i++)
                subjectWise[i]=students[i].subjectC;
        }else{
            subjectWise[0]=-1;
        }

        return subjectWise;
    }
    public int[] totalSubjectWiseMarksForAllStudent(Student[] students){
        int[] marks=new int[3];
        for(int i=0;i<3;i++)
        {
            marks[i]+=students[i].subjectA;
        }
        for(int i=0;i<3;i++)
        {
            marks[i]+=students[i].subjectB;
        }
        for(int i=0;i<3;i++)
        {
            marks[i]+=students[i].subjectC;
        }

        return marks;
    }
    public int subjectATotalByStudents(int[] marks) {
        return marks[0];
    }
    public int subjectBTotalByStudents(int[] marks) {
        return marks[1];
    }
    public int subjectCTotalByStudents(int[] marks) {
        return marks[2];
    }

    public int subjectTotalByStudents(int[] marks){
        int subjectTot = 0;
        for (int i = 0; i < 3; i++) {
            subjectTot += marks[i];
        }
        return subjectTot;
    }

    public double subjectAAverageByStudents(int[] marks) {
        double avgSubA;
        avgSubA=marks[0]/3;
        return avgSubA;
    }
    public double subjectBAverageByStudents(int[] marks) {
        double avgSubB;
        avgSubB=marks[1]/3;
        return avgSubB;
    }
    public double subjectCAverageByStudents(int[] marks) {
        double avgSubC;
        avgSubC=marks[2]/3;
        return avgSubC;
    }

    @Override
    public String toString() {
        return "Student{" +
                "subjectA=" + subjectA +
                ", subjectB=" + subjectB +
                ", subjectC=" + subjectC +
                '}';
    }
}