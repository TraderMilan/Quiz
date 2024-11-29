package lib;

import java.util.ArrayList;

public class Question {
    private String question;
    private int countOfRightAnswers;
    private ArrayList<Answer> answers;
    private String rightAnswer;

    public Question(String question, int countOfRightAnswers, ArrayList<Answer> answers, String rightAnswer) {
        this.question = question;
        this.countOfRightAnswers = countOfRightAnswers;
        this.answers = answers;
        this.rightAnswer = rightAnswer;
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }
    public String getQuestion() {
        return question;
    }
    public int getCountOfRightAnswers() {
        return countOfRightAnswers;
    }
    public String getRightAnswer(){
        return rightAnswer;
    }

    public void addAnswer(Answer answer){
        this.answers.add(answer);
    }

}



