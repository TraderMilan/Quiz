package lib;

import java.util.ArrayList;

public class Questions {
    private final String question;
    private final int countOfRightAnswers;
    private final ArrayList <String> answers;
    private final String rightAnswers;

    public Questions(String question, String rightAnswers, int countOfRightAnswers, ArrayList<String> answers) {
        this.rightAnswers = rightAnswers;
        this.question = question;
        this.countOfRightAnswers = countOfRightAnswers;
        this.answers = answers;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }
    public String getRightAnswers() {
        return rightAnswers;
    }
    public String getQuestion() {
        return question;
    }
    public int getCountOfRightAnswers() {
        return countOfRightAnswers;
    }


}



