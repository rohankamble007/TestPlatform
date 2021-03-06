package RiaInsuretech.acme.exam.Entities;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

public class QuestionModel {
    @Size(max = 4000)
    private String id;
    @Size(max = 4000)
    private String question;
    @Size(max = 4000)
    private String options;
    @Size(max = 2)
    private String ans = "a";
    @Size(max = 2)
    private String marks = "1";

    public QuestionModel(String question, String options, String ans, String marks) {
        this.question = question;
        this.options = options;
        this.ans = ans;
        this.marks = marks;
    }

    public QuestionModel() {
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public Question getQuestion() {

        String[] ops = options.split(" : ");

        return new Question(id, question, ops[0], ops[1], ops[2], ops[3]);
    }

}
