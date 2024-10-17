import java.util.List;

public class Question {
    private int q_no;
    private String question;
    private List<String> answers;

    public Question(int q_no, String question, List<String> answers){
        this.q_no = q_no;
        this.question = question;
        this.answers = answers;
    }

    public int getQ_no() {
        return q_no;
    }

    public void setQ_no(int q_no) {
        this.q_no = q_no;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
    public void print(){
        System.out.println("question no: " + q_no);
        System.out.println("question: " + question);
        answers.forEach((a) -> System.out.println(a));
    }
}
