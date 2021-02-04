import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class AnswerSheet {
    private Collection<String> answers;
    private int questionId;
    private String question;


    public void setAnswers(Collection<String> answers) {
        this.answers = answers;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Object getAnswers() {
        return answers;
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getQuestion() {
        return question;
    }


    public Map<Integer,String> organiseAnswer()
    {
        int i=1;
        Map<Integer,String> answerWithSequence = new HashMap<>();
        for (String answer:answers) {
            answerWithSequence.put(i,answer);
            i++;
        }
        return answerWithSequence;
    }

    @Override
    public String toString() {
        return "AnswerSheet{" +
                "answers=" + answers +
                ", questionId=" + questionId +
                ", question='" + question + '\'' +
                '}';
    }
}
