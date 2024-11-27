package lib;

import java.util.ArrayList;

public class Quiz {
    private final ArrayList<Questions> listOfQuestions;

    public Quiz(ArrayList<Questions> listOfQuestions) {
        this.listOfQuestions = listOfQuestions;
    }


    public void addQuestion (Questions question){
    listOfQuestions.add(question);
    }
    //musíme správne vypísať, skontrolovať ci sa hodnoty rovnajú a ci je odpoveď správna

    public String checkAnswerType(Questions questions){
        if (questions.getCountOfRightAnswers()> 1){
            return " (viacero odpovedi je spravnych)";
        } else {
            return " (len 1 odpoved je spravna)";
        }
    }

    public void printQuestion (Questions question){
        System.out.println(question.getQuestion()+checkAnswerType(question));
        for (String option: question.getAnswers()){
            System.out.println(option);
        }

    }
}
