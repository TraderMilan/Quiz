package lib;

import java.util.ArrayList;

public class Quiz {
    private final ArrayList<Question> listOfQuestions;

    public Quiz(ArrayList<Question> listOfQuestions) {
        this.listOfQuestions = listOfQuestions;
    }

    public void addQuestion (Question question){
    listOfQuestions.add(question);
    }

    public String checkAnswerType(Question questions){
        if (questions.getCountOfRightAnswers()> 1){
            return " (viacero odpovedi je spravnych)";
        } else {
            return " (len 1 odpoved je spravna)";
        }
    }

    public void printQuestion (Question question){
        System.out.println(question.getQuestion()+checkAnswerType(question));
        for (Answer option: question.getAnswers()){
            System.out.println(option.getAnswer());
        }
    }
}
