import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("Spring.xml");
        AnswerSheet question1 = (AnswerSheet) context.getBean("answerSheetList");

        Map<Integer,String> answers1=question1.organiseAnswer();
        System.out.println(question1.getQuestionId()+". "+question1.getQuestion());
        System.out.println("Answer: ");
        answers1.entrySet().stream().forEach(p->System.out.println(p.getKey()+") "+p.getValue()));

        AnswerSheet question2 = (AnswerSheet) context.getBean("answerSheetSet");
        Map<Integer,String> answers2=question2.organiseAnswer();
        System.out.println(question2.getQuestionId()+". "+question2.getQuestion());
        System.out.println("Answer: ");
        answers2.entrySet().stream().forEach(p1->System.out.println(p1.getKey()+") "+p1.getValue()));

    }
}

