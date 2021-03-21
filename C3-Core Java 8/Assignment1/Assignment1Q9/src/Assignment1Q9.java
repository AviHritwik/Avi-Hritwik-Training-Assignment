import java.util.Scanner;

public class Assignment1Q9 {
    public static void main(String[] args) {
        Student[] students=new Student[3];
        var st=new Student();
        int sub1,sub2,sub3;
        Scanner input=new Scanner(System.in);
        //Input for Detail for student
        for(int i=1;i<=3;i++)
        {
            System.out.println("Enter details of student "+i+":");
            System.out.print("\tMarks of subject"+i+": ");
            sub1=input.nextInt();
            System.out.print("\tMarks of subject"+i+": ");
            sub2=input.nextInt();
            System.out.print("\tMarks of subject"+i+": ");
            sub3=input.nextInt();
            students[i-1]=new Student(sub1,sub2,sub3);
        }
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println("\n***********************************************************************************");
        System.out.println("Total marks secured by all students: "+st.studentsTotalMarksInAllSubjects(students));
        System.out.println("Total marks secured by all students: "+st.studentsAverageMarksInAllSubjects(students));

        int[] marks=new int[3];

        marks=st.totalSubjectWiseMarksForAllStudent(students);
        System.out.println("Subject Wise marks of students : \n\tsubjectA:"+marks[0]+"\n\tsubjectB:"+marks[1]+"\n\tsubjectC:"+marks[2]);
        System.out.println("Total marks by students in subject A : "+st.subjectATotalByStudents(marks));
        System.out.println("Total marks by students in subject B : "+st.subjectBTotalByStudents(marks));
        System.out.println("Total marks by students in subject C : "+st.subjectCTotalByStudents(marks));
        int[] subjectWise=new int[3];
        String subjectName = new String();
        subjectWise[0]=-1;
        while(subjectWise[0]==-1) {
            System.out.println("Subject name whose student wise result you want to se: (SubjectA,SubjectB,SubjectC");
            subjectName = input.next();
            subjectWise = st.subjectWiseMarks(students, subjectName);
            if(subjectWise[0]==-1)
                System.out.println("Wrong name entered!! TRY AGAIN");
        }
        System.out.println("Marks of "+subjectName+" for \n\tStudent1 :"+subjectWise[0]+"\n\tStudent2 :"+subjectWise[1]+
                "\n\tStudent3 :"+subjectWise[2]);
        System.out.println("Total marks in subject : "+st.subjectTotalByStudents(marks));
        System.out.println("Average marks by students in subject A : "+st.subjectAAverageByStudents(marks));
        System.out.println("Average marks by students in subject B : "+st.subjectBAverageByStudents(marks));
        System.out.println("Average marks by students in subject C : "+st.subjectCAverageByStudents(marks));
        System.out.println("\n***********************************************************************************");

    }
}
